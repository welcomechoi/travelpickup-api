package com.travelpickup.member.dto;

import lombok.Builder;
import lombok.Getter;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

@Getter
public class LoginManager implements UserDetails {

    private Long id;

    private String role;

    private Long centerId;


    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        return new ArrayList<>(List.of((GrantedAuthority) this::getRole));
    }

    @Override
    public String getPassword() {
        return "";
    }

    @Override
    public String getUsername() {
        return "";
    }

    @Override
    public boolean isAccountNonExpired() {
        return false;
    }

    @Override
    public boolean isAccountNonLocked() {
        return false;
    }

    @Override
    public boolean isCredentialsNonExpired() {
        return false;
    }

    @Override
    public boolean isEnabled() {
        return false;
    }

    @Builder
    public LoginManager(Long id,
                        String role,
                        Long centerId) {
        this.id = id;
        this.role = role;
        this.centerId = centerId;
    }

    public static LoginManager of(Long id,
                                  String role,
                                  Long centerId) {
        return LoginManager
                .builder()
                .id(id)
                .role(role)
                .centerId(centerId)
                .build();
    }

}
