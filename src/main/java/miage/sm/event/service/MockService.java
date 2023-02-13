package miage.sm.event.service;

import miage.sm.event.model.Product;
import miage.sm.event.model.ProductCategory;
import org.springframework.stereotype.Service;
import java.math.BigDecimal;
import java.util.*;

@Service
public class MockService {

    public List<ProductCategory> getAllCategories(){
        ProductCategory categoryAnniv = ProductCategory.builder().id(Long.parseLong("4")).categoryName("Anniversaire")
                .build();
        ProductCategory categoryGuestGift = ProductCategory.builder().id(Long.parseLong("3")).categoryName("Cadeaux invités")
                .build();
        ProductCategory categoryMariage = ProductCategory.builder().id(Long.parseLong("2")).categoryName("Mariage")
                .build();
        ProductCategory categoryDemandeMariage = ProductCategory.builder().id(Long.parseLong("1")).categoryName("Demande Mariage")
                .build();
       return Arrays.asList(categoryDemandeMariage,categoryAnniv,categoryMariage,categoryGuestGift);
    }

    public List<Product> getAllAnniversaryProducts(){
        List<Product> products = new ArrayList<>();
        ProductCategory categoryAnniv = ProductCategory.builder().id(Long.parseLong("4")).categoryName("Anniversaire")
                .build();
        Product p1 = Product.builder()
                .id(Long.parseLong("1"))
                .name("Anniversaire décoration")
                .dateCreated(new Date())
                .unitPrice(new BigDecimal(55))
                .active(true)
                .description("1 pièce Tissu de fond fête d'anniversaire animal & à imprimé végétale").unitsInStock(333)
                .imageUrl("assets/images/Deco/Anniv/Anniv.png")
                .category(categoryAnniv)
                .build();
        Product p2 = Product.builder()
                .id(Long.parseLong("2"))
                .name("Anniversaire décoration")
                .dateCreated(new Date())
                .unitPrice(new BigDecimal(60))
                .active(true)
                .description("2 pièce Tissu de fond fête d'anniversaire animal & à imprimé végétale").unitsInStock(333)
                .imageUrl("assets/images/Deco/Anniv/Anniv1.png")
                .category(categoryAnniv)
                .build();
        Product p3 = Product.builder()
                .id(Long.parseLong("3"))
                .name("Anniversaire décoration")
                .dateCreated(new Date())
                .unitPrice(new BigDecimal(43))
                .active(true)
                .description("4 pièce Tissu de fond fête d'anniversaire animal & à imprimé végétale").unitsInStock(333)
                .imageUrl("assets/images/Deco/Anniv/Anniv2.png")
                .category(categoryAnniv)
                .build();
        Product p4 = Product.builder()
                .id(Long.parseLong("4"))
                .name("Anniversaire décoration")
                .dateCreated(new Date())
                .unitPrice(new BigDecimal(54))
                .active(true)
                .description("3 pièce Tissu de fond fête d'anniversaire animal & à imprimé végétale").unitsInStock(333)
                .imageUrl("assets/images/Deco/Anniv/Anniv3.png")
                .category(categoryAnniv)
                .build();
        Product p5 = Product.builder()
                .id(Long.parseLong("5"))
                .name("Anniversaire décoration")
                .dateCreated(new Date())
                .unitPrice(new BigDecimal(55))
                .active(true)
                .description("5 pièce Tissu de fond fête d'anniversaire animal & à imprimé végétale").unitsInStock(333)
                .imageUrl("assets/images/Deco/Anniv/Anniv4.png")
                .category(categoryAnniv)
                .build();
        Product p6 = Product.builder()
                .id(Long.parseLong("6"))
                .name("Anniversaire décoration")
                .dateCreated(new Date())
                .unitPrice(new BigDecimal(55))
                .active(true)
                .description("5 pièce Tissu de fond fête d'anniversaire animal & à imprimé végétale").unitsInStock(333)
                .imageUrl("assets/images/Deco/Anniv/Anniv5.png")
                .category(categoryAnniv)
                .build();
        Product p7 = Product.builder()
                .id(Long.parseLong("7"))
                .name("Anniversaire décoration")
                .dateCreated(new Date())
                .unitPrice(new BigDecimal(55))
                .active(true)
                .description("5 pièce Tissu de fond fête d'anniversaire animal & à imprimé végétale").unitsInStock(333)
                .imageUrl("assets/images/Deco/Anniv/Anniv6.png")
                .category(categoryAnniv)
                .build();
        Product p8 = Product.builder()
                .id(Long.parseLong("8"))
                .name("Anniversaire décoration")
                .dateCreated(new Date())
                .unitPrice(new BigDecimal(55))
                .active(true)
                .description("5 pièce Tissu de fond fête d'anniversaire animal & à imprimé végétale").unitsInStock(333)
                .imageUrl("assets/images/Deco/Anniv/Anniv7.png")
                .category(categoryAnniv)
                .build();
        Product p9 = Product.builder()
                .id(Long.parseLong("9"))
                .name("Anniversaire décoration")
                .dateCreated(new Date())
                .unitPrice(new BigDecimal(55))
                .active(true)
                .description("5 pièce Tissu de fond fête d'anniversaire animal & à imprimé végétale").unitsInStock(333)
                .imageUrl("assets/images/Deco/Anniv/Anniv8.png")
                .category(categoryAnniv)
                .build();
        Product p10 = Product.builder()
                .id(Long.parseLong("10"))
                .name("Anniversaire décoration")
                .dateCreated(new Date())
                .unitPrice(new BigDecimal(55))
                .active(true)
                .description("5 pièce Tissu de fond fête d'anniversaire animal & à imprimé végétale").unitsInStock(333)
                .imageUrl("assets/images/Deco/Anniv/Anniv9.png")
                .category(categoryAnniv)
                .build();
        products.add(p1);
        products.add(p2);
        products.add(p3);
        products.add(p4);
        products.add(p5);
        products.add(p6);
        products.add(p7);
        products.add(p8);
        products.add(p9);
        products.add(p10);
        return products;
    }

    public List<Product> getAllGuestGiftProducts(){
        List<Product> products = new ArrayList<>();
        ProductCategory categoryGuestGift = ProductCategory.builder().id(Long.parseLong("3")).categoryName("Cadeaux invités")
                .build();
        Product p1 = Product.builder()
                .id(Long.parseLong("1"))
                .name("Cadeaux invités")
                .dateCreated(new Date())
                .unitPrice(new BigDecimal(55))
                .active(true)
                .description("1 pièce Tissu de fond fête d'anniversaire animal & à imprimé végétale").unitsInStock(333)
                .imageUrl("assets/images/Deco/GuestGift/GuestGift1.png")
                .category(categoryGuestGift)
                .build();
        Product p2 = Product.builder()
                .id(Long.parseLong("2"))
                .name("Cadeaux invités")
                .dateCreated(new Date())
                .unitPrice(new BigDecimal(60))
                .active(true)
                .description("2 pièce Tissu de fond fête d'anniversaire animal & à imprimé végétale").unitsInStock(333)
                .imageUrl("assets/images/Deco/GuestGift/GuestGift2.png")
                .category(categoryGuestGift)
                .build();
        Product p3 = Product.builder()
                .id(Long.parseLong("3"))
                .name("Cadeaux invités")
                .dateCreated(new Date())
                .unitPrice(new BigDecimal(43))
                .active(true)
                .description("4 pièce Tissu de fond fête d'anniversaire animal & à imprimé végétale").unitsInStock(333)
                .imageUrl("assets/images/Deco/GuestGift/GuestGift3.png")
                .category(categoryGuestGift)
                .build();

        products.add(p1);
        products.add(p2);
        products.add(p3);
        return products;
    }

    public List<Product> getAllMariageProducts(){
        List<Product> products = new ArrayList<>();
        ProductCategory categoryMariage = ProductCategory.builder().id(Long.parseLong("2")).categoryName("Mariage")
                .build();
        Product p1 = Product.builder()
                .id(Long.parseLong("1"))
                .name("Mariage décoration")
                .dateCreated(new Date())
                .unitPrice(new BigDecimal(55))
                .active(true)
                .description("1 pièce Tissu de fond fête d'anniversaire animal & à imprimé végétale").unitsInStock(333)
                .imageUrl("assets/images/Deco/Mariage/Mariage1.png")
                .category(categoryMariage)
                .build();
        Product p2 = Product.builder()
                .id(Long.parseLong("2"))
                .name("Mariage décoration")
                .dateCreated(new Date())
                .unitPrice(new BigDecimal(60))
                .active(true)
                .description("2 pièce Tissu de fond fête d'anniversaire animal & à imprimé végétale").unitsInStock(333)
                .imageUrl("assets/images/Deco/Mariage/Mariage2.png")
                .category(categoryMariage)
                .build();
        Product p3 = Product.builder()
                .id(Long.parseLong("3"))
                .name("Mariage décoration")
                .dateCreated(new Date())
                .unitPrice(new BigDecimal(43))
                .active(true)
                .description("4 pièce Tissu de fond fête d'anniversaire animal & à imprimé végétale").unitsInStock(333)
                .imageUrl("assets/images/Deco/Mariage/Mariage3.png")
                .category(categoryMariage)
                .build();

        products.add(p1);
        products.add(p2);
        products.add(p3);
        return products;
    }

    public List<Product> getAllDemandeMariageProducts(){
        List<Product> products = new ArrayList<>();
        ProductCategory categoryDemandeMariage = ProductCategory.builder().id(Long.parseLong("1")).categoryName("Demande Mariage")
                .build();
        Product p1 = Product.builder()
                .id(Long.parseLong("1"))
                .name("Demande Mariage décoration")
                .dateCreated(new Date())
                .unitPrice(new BigDecimal(55))
                .active(true)
                .description("1 pièce Tissu de fond fête d'anniversaire animal & à imprimé végétale").unitsInStock(333)
                .imageUrl("assets/images/Deco/MarryMe/Marryme1.png")
                .category(categoryDemandeMariage)
                .build();
        Product p2 = Product.builder()
                .id(Long.parseLong("2"))
                .name("Demande Mariage décoration")
                .dateCreated(new Date())
                .unitPrice(new BigDecimal(60))
                .active(true)
                .description("2 pièce Tissu de fond fête d'anniversaire animal & à imprimé végétale").unitsInStock(333)
                .imageUrl("assets/images/Deco/MarryMe/Marryme2.png")
                .category(categoryDemandeMariage)
                .build();
        Product p3 = Product.builder()
                .id(Long.parseLong("3"))
                .name("Demande Mariage décoration")
                .dateCreated(new Date())
                .unitPrice(new BigDecimal(43))
                .active(true)
                .description("4 pièce Tissu de fond fête d'anniversaire animal & à imprimé végétale").unitsInStock(333)
                .imageUrl("assets/images/Deco/MarryMe/Marryme3.png")
                .category(categoryDemandeMariage)
                .build();

        products.add(p1);
        products.add(p2);
        products.add(p3);
        return products;
    }

    public List<Product> getAllProducts(){
        List<Product> products = new ArrayList<>();
        products.addAll(getAllDemandeMariageProducts());
        products.addAll(getAllAnniversaryProducts());
        products.addAll(getAllMariageProducts());
        products.addAll(getAllAnniversaryProducts());
        products.addAll(getAllGuestGiftProducts());

        return products;
    }

}
