package uz.pdp.service.impl;

import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;
import uz.pdp.model.UserEntity;
import uz.pdp.repo.UserRepo;
import uz.pdp.service.UserService;
@Component
public class UserServiceImpl implements UserService {

private final UserRepo userRepo;

    public UserServiceImpl(UserRepo userRepo) {
        this.userRepo = userRepo;
    }

    @Override
    public UserEntity getByUsername(String username) {
        try {
           return userRepo.getUsername(username);
        }catch (Exception e){
            return null;
        }

    }
}
