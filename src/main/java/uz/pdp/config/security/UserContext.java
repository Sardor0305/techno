package uz.pdp.config.security;

import lombok.Getter;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import uz.pdp.model.UserEntity;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
@Getter
public class UserContext implements UserDetails {
    private final UserEntity userEntity;

    public UserContext(UserEntity userEntity) {
        this.userEntity = userEntity;
    }

    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
       final List<GrantedAuthority> authorities = new ArrayList<>();
        System.out.println(authorities);
//        authorities.add(new SimpleGrantedAuthority(userEntity.getRole()));
//        authorities.add(new SimpleGrantedAuthority(userEntity.getUsername()));
//        authorities.add(new SimpleGrantedAuthority(userEntity.getPassword()));
        return authorities;
//        return null;
    }
    public Long getId(){
        return userEntity.getId();
    }

    @Override
    public String getPassword() {
        return userEntity.getPassword();
    }

    @Override
    public String getUsername() {
        return userEntity.getUsername();
    }

    @Override
    public boolean isAccountNonExpired() {
        return true;
    }

    @Override
    public boolean isAccountNonLocked() {
        return true;
    }

    @Override
    public boolean isCredentialsNonExpired() {
        return true;
    }

    @Override
    public boolean isEnabled() {
        return true;
    }
}
