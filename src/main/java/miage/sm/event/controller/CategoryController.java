package miage.sm.event.controller;

import miage.sm.event.model.ProductCategory;
import miage.sm.event.service.MockService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@CrossOrigin("http://localhost:4200")
@RestController
public class CategoryController {

    @Autowired
    private MockService mockService;

    @GetMapping("/api/product-categories/{id}")
    ProductCategory findOne(@PathVariable Long id) {
        return mockService.getAllCategories().stream().filter(cat -> id == cat.getId()).findAny().get();
    }

    @GetMapping("/api/product-categories")
    List<ProductCategory> find() {
        return mockService.getAllCategories();
    }
}
