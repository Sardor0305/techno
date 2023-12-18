package uz.pdp.model;

import lombok.*;
import org.springframework.context.annotation.Bean;
import uz.pdp.enam.UserRole;
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Builder
public class UserEntity {
    private Long id;
    private String username;
    private String password;
    private String role;

}
