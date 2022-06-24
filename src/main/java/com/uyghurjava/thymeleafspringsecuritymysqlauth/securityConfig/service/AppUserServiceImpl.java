package com.uyghurjava.thymeleafspringsecuritymysqlauth.securityConfig.service;

import com.uyghurjava.thymeleafspringsecuritymysqlauth.securityConfig.repository.AppUserRepository;
import com.uyghurjava.thymeleafspringsecuritymysqlauth.securityConfig.repository.RoleRepository;
import com.uyghurjava.thymeleafspringsecuritymysqlauth.securityConfig.secModel.AppUser;
import com.uyghurjava.thymeleafspringsecuritymysqlauth.securityConfig.secModel.Role;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class AppUserServiceImpl implements AppUserService {
    private static final Logger logger = LoggerFactory.getLogger(AppUserServiceImpl.class);

    private AppUserRepository appUserRepository;
    private RoleRepository roleRepository;

    public AppUserServiceImpl(AppUserRepository appUserRepository, RoleRepository roleRepository) {
        this.appUserRepository = appUserRepository;
        this.roleRepository = roleRepository;
    }

    @Override
    public AppUser findByUsername(String username) {
        return appUserRepository.findByUsername(username);
    }

    @Override
    public Role findByName(String name) {

        return roleRepository.findByName(name);
    }

    @Override
    public AppUser saveUser(AppUser appUser) {
        //TODO: save with username et password
        logger.debug("This saveUser method(AppUserServiceImpl) starts here");
        AppUser newUser = appUserRepository.findByUsername(appUser.getUsername());
        if(newUser != null){
            logger.info("This user is already in DB(AppUserServiceImpl)");
        }

        return appUserRepository.save(newUser);
    }

    @Override
    public Role saveRole(Role role) {
        //TODO: check the roleName
        return roleRepository.save(role);
    }


    @Override
    public Role loadRoleByName(String roleName) {

        return roleRepository.findByName(roleName);
    }

    @Override
    public void addRoleToUser(String username, String roleName) {

    }
}
