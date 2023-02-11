package miage.sm.event.controller;

import miage.sm.event.model.Product;
import miage.sm.event.service.MockService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.support.PagedListHolder;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Collectors;

@CrossOrigin("http://localhost:4200")
@RestController
public class ProductController {

    @Autowired
    private MockService mockService;

    @GetMapping("/api/products/{id}")
    Product findOne(@PathVariable Long id) {
        return mockService.getAllProducts().stream().filter(product -> product.getId() == id).findFirst().get();
    }

    @GetMapping("/api/products")
    public Page<Product> find(Pageable pageable) {
        List<Product> allProducts = mockService.getAllProducts();
        PagedListHolder page = new PagedListHolder(allProducts);
        page.setPageSize(pageable.getPageSize()); // number of items per page
        page.setPage(pageable.getPageNumber());      // set to first page
        return new PageImpl<>(page.getPageList(), pageable, allProducts.size());
    }

    @GetMapping("/api/products/search/category-id")
    public Page<Product> greeting(@RequestParam(value = "id") Long id, Pageable pageable) {

        List<Product> allProducts = mockService.getAllProducts();
        List<Product> filtredList = allProducts.stream().filter(product -> id == product.getCategory().getId())
                .collect(Collectors.toList());
        PagedListHolder page = new PagedListHolder(filtredList);
        page.setPageSize(pageable.getPageSize());
        page.setPage(pageable.getPageNumber());
        return new PageImpl<>(page.getPageList(), pageable, filtredList.size());
    }

    @GetMapping("/api/products/search/category-name")
    public Page<Product> greeting(@RequestParam(value = "name") String name, Pageable pageable) {

        List<Product> allProducts = mockService.getAllProducts();
        if(name.equalsIgnoreCase("All"))
            return new PageImpl<>(allProducts, pageable, allProducts.size());

        List<Product> filtredList = allProducts.stream().filter(product ->
                        name.equalsIgnoreCase(product.getCategory().getCategoryName()))
                .collect(Collectors.toList());
        PagedListHolder page = new PagedListHolder(filtredList);
        page.setPageSize(pageable.getPageSize());
        page.setPage(pageable.getPageNumber());
        return new PageImpl<>(page.getPageList(), pageable, filtredList.size());
    }

    @GetMapping("/api/products/search/name-contains")
    public Page<Product> namecontains(@RequestParam(value = "name") String name, Pageable pageable) {
        //PageRequest paginacao = PageRequest.of(1, 10);
        List<Product> allProducts = mockService.getAllProducts();
        List<Product> filtredList = allProducts.stream().filter(product -> product.getName().toUpperCase()
                .contains(name.toUpperCase())).collect(Collectors.toList());

        PagedListHolder page = new PagedListHolder(filtredList);
        page.setPageSize(pageable.getPageSize());
        page.setPage(pageable.getPageNumber());
        return new PageImpl<>(page.getPageList(), pageable, filtredList.size());
    }

}
