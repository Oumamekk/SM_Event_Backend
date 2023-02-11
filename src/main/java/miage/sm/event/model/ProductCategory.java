package miage.sm.event.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.*;

import java.util.Set;

/**
 * @author Gaëtan Bloch
 * Created on 05/05/2020
 */
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Builder
public class ProductCategory {

    private Long id;

    private String categoryName;

    @JsonIgnore
    private Set<Product> products;
}
