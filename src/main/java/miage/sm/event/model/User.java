package miage.sm.event.model;

import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Builder
public class User {

    private Long id;
    private String mail;
    private String password;

}
