package uz.pdp.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;
import uz.pdp.model.UserEntity;
@Component
public interface UserService {
    UserEntity getByUsername(String username);
}
