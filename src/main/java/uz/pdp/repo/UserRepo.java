package uz.pdp.repo;

import lombok.RequiredArgsConstructor;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;
import uz.pdp.model.UserEntity;

import java.util.List;

@Component
@RequiredArgsConstructor
public class UserRepo {
    private final JdbcTemplate jdbcTemplate;
    public UserEntity getUsername(String username){
    return jdbcTemplate.queryForObject("select * from users where username = ?",
                new BeanPropertyRowMapper<>(UserEntity.class));
    }

}
