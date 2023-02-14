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
                .name("Safari party")
                .dateCreated(new Date())
                .unitPrice(new BigDecimal(55))
                .active(true)
                .description("1 pièce Tissu de fond fête d'anniversaire animal à imprimé végétale avec les animaux du safari").unitsInStock(333)
                .imageUrl("assets/images/Deco/Anniv/Anniv.png")
                .category(categoryAnniv)
                .build();
        Product p2 = Product.builder()
                .id(Long.parseLong("2"))
                .name("Pink party")
                .dateCreated(new Date())
                .unitPrice(new BigDecimal(60))
                .active(true)
                .description("1 pièce de tissu de fond fête d'anniversaire personnalisée avec arc de ballons roses").unitsInStock(333)
                .imageUrl("assets/images/Deco/Anniv/Anniv1.png")
                .category(categoryAnniv)
                .build();
        Product p3 = Product.builder()
                .id(Long.parseLong("3"))
                .name("light green party")
                .dateCreated(new Date())
                .unitPrice(new BigDecimal(43))
                .active(true)
                .description("Arc de ballons verts, blanc et doré pour un anniversaire").unitsInStock(333)
                .imageUrl("assets/images/Deco/Anniv/Anniv2.png")
                .category(categoryAnniv)
                .build();
        Product p4 = Product.builder()
                .id(Long.parseLong("4"))
                .name("Light blue party")
                .dateCreated(new Date())
                .unitPrice(new BigDecimal(54))
                .active(true)
                .description("Arc de ballons bleu, blanc et argenté pour un anniversaire").unitsInStock(333)
                .imageUrl("assets/images/Deco/Anniv/Anniv3.png")
                .category(categoryAnniv)
                .build();
        Product p5 = Product.builder()
                .id(Long.parseLong("5"))
                .name("Dark blue party")
                .dateCreated(new Date())
                .unitPrice(new BigDecimal(55))
                .active(true)
                .description("Arc de ballons bleu, blanc et doré pour un anniversaire").unitsInStock(333)
                .imageUrl("assets/images/Deco/Anniv/Anniv4.png")
                .category(categoryAnniv)
                .build();
        Product p6 = Product.builder()
                .id(Long.parseLong("6"))
                .name("Golden black party")
                .dateCreated(new Date())
                .unitPrice(new BigDecimal(55))
                .active(true)
                .description("Arc de ballons noir, blanc et doré pour un anniversaire").unitsInStock(333)
                .imageUrl("assets/images/Deco/Anniv/Anniv5.png")
                .category(categoryAnniv)
                .build();
        Product p7 = Product.builder()
                .id(Long.parseLong("7"))
                .name("Pinky princess")
                .dateCreated(new Date())
                .unitPrice(new BigDecimal(55))
                .active(true)
                .description("1 pièce de tissu de fond fête d'anniversaire personnalisée rose avec un mini arc de ballons roses accompagné de sa princesse").unitsInStock(333)
                .imageUrl("assets/images/Deco/Anniv/Anniv6.png")
                .category(categoryAnniv)
                .build();
        Product p8 = Product.builder()
                .id(Long.parseLong("8"))
                .name("Golden black party premium")
                .dateCreated(new Date())
                .unitPrice(new BigDecimal(55))
                .active(true)
                .description("5 pièce Tissu de fond fête d'anniversaire doré avec un arc de ballons noir, blanc et doré et 3 supports cylindriques").unitsInStock(333)
                .imageUrl("assets/images/Deco/Anniv/Anniv7.png")
                .category(categoryAnniv)
                .build();
        Product p9 = Product.builder()
                .id(Long.parseLong("9"))
                .name("Nude premium party")
                .dateCreated(new Date())
                .unitPrice(new BigDecimal(55))
                .active(true)
                .description("2 supports de fleurs avec un arc de ballons nudes, doré et blanc pour un anniversaire").unitsInStock(333)
                .imageUrl("assets/images/Deco/Anniv/Anniv8.png")
                .category(categoryAnniv)
                .build();
        Product p10 = Product.builder()
                .id(Long.parseLong("10"))
                .name("Nude premium party")
                .dateCreated(new Date())
                .unitPrice(new BigDecimal(55))
                .active(true)
                .description("2 supports de fleurs avec un arc circulaire de ballons nudes, doré et blanc pour un anniversaire").unitsInStock(333)
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
                .name("Bougies inscrutées ")
                .dateCreated(new Date())
                .unitPrice(new BigDecimal(55))
                .active(true)
                .description("10 Bougies inscrutées dans du bois avec coeur personnalisée pour un cadeau d'invité").unitsInStock(333)
                .imageUrl("assets/images/Deco/GuestGift/GuestGift1.png")
                .category(categoryGuestGift)
                .build();
        Product p2 = Product.builder()
                .id(Long.parseLong("2"))
                .name("Bocal de fleurs")
                .dateCreated(new Date())
                .unitPrice(new BigDecimal(60))
                .active(true)
                .description("Bocal de fleurs avec message personnalisée pour un cadeau d'invité").unitsInStock(333)
                .imageUrl("assets/images/Deco/GuestGift/GuestGift2.png")
                .category(categoryGuestGift)
                .build();
        Product p3 = Product.builder()
                .id(Long.parseLong("3"))
                .name("Fleurs séchées")
                .dateCreated(new Date())
                .unitPrice(new BigDecimal(43))
                .active(true)
                .description("10 tubes de fleurs parfumées et séchées pour un cadeau d'invité").unitsInStock(333)
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
                .name("Rideau blanc à fleurs sauvages")
                .dateCreated(new Date())
                .unitPrice(new BigDecimal(55))
                .active(true)
                .description("Rideau de fleurs sauvages  avec deux pots de fleurs d'épis accompagné de deux portes pour mariage").unitsInStock(333)
                .imageUrl("assets/images/Deco/Mariage/Mariage1.png")
                .category(categoryMariage)
                .build();
        Product p2 = Product.builder()
                .id(Long.parseLong("2"))
                .name("Rideau blanc accompagné de roses blanches")
                .dateCreated(new Date())
                .unitPrice(new BigDecimal(60))
                .active(true)
                .description("Rideau blanc accompagné de roses blanches et une table pour gâteau de mariage").unitsInStock(333)
                .imageUrl("assets/images/Deco/Mariage/Mariage2.png")
                .category(categoryMariage)
                .build();
        Product p3 = Product.builder()
                .id(Long.parseLong("3"))
                .name("Support de fleurs de mariage")
                .dateCreated(new Date())
                .unitPrice(new BigDecimal(43))
                .active(true)
                .description("Set de 5 supports de fleurs accompagnés de leurs bouquets de fleurs et d'un cadre pour mariage ").unitsInStock(333)
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
                .name("Losange Marry me et bougies")
                .dateCreated(new Date())
                .unitPrice(new BigDecimal(55))
                .active(true)
                .description("Set de bougie parfumées et de fleurs accompagné d'un support losange avec le texte MARRY ME pour une demande de mariage").unitsInStock(333)
                .imageUrl("assets/images/Deco/MarryMe/Marryme1.png")
                .category(categoryDemandeMariage)
                .build();
        Product p2 = Product.builder()
                .id(Long.parseLong("2"))
                .name("Décoration demande de mariage blanc-rose")
                .dateCreated(new Date())
                .unitPrice(new BigDecimal(60))
                .active(true)
                .description("Set de Ballon à helium et support circulaire accompagné du texte MARRY ME").unitsInStock(333)
                .imageUrl("assets/images/Deco/MarryMe/Marryme2.png")
                .category(categoryDemandeMariage)
                .build();
        Product p3 = Product.builder()
                .id(Long.parseLong("3"))
                .name("Décoration demande de mariage blanc-doré")
                .dateCreated(new Date())
                .unitPrice(new BigDecimal(43))
                .active(true)
                .description("Set de Ballon à helium doré et blanc accompagné du texte MARRY ME en grand model").unitsInStock(333)
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
