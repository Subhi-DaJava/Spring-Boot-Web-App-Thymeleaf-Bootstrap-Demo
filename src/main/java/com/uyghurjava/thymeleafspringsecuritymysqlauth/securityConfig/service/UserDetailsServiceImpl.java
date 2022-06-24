package com.uyghurjava.thymeleafspringsecuritymysqlauth.securityConfig.service;

import com.uyghurjava.thymeleafspringsecuritymysqlauth.securityConfig.secModel.AppUser;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.Collection;
import java.util.stream.Collectors;

@Service
public class UserDetailsServiceImpl implements UserDetailsService {
    private static final Logger logger = LoggerFactory.getLogger(UserDetailsServiceImpl.class);

    private AppUserService appUserService;

    public UserDetailsServiceImpl(AppUserService appUserService) {
        this.appUserService = appUserService;
    }

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        logger.debug("Method loadUserByUsername(UserDetailsServiceImpl) with username=" + username +" starts here");
        AppUser appUser = appUserService.findByUsername(username);

        if(appUser == null){
            logger.debug("This username= " + username + " not found in DB!");
            throw new UsernameNotFoundException("This user with username=" + username + " not found in DB!");
        }
        Collection<GrantedAuthority> authorities = appUser.getRoles()
                .stream()
                .map(role -> new SimpleGrantedAuthority(role.getName()))
                .collect(Collectors.toList());
        if ((authorities.isEmpty())){
            logger.info("At the moment, this user with username=" + username + " has any role !!");
        }
        User user = new User(appUser.getUsername(), appUser.getPassword(), authorities);
        return user;
    }
}
