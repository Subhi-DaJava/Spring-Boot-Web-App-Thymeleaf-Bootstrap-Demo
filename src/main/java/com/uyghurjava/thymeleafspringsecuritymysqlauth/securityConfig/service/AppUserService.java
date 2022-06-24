package com.uyghurjava.thymeleafspringsecuritymysqlauth.securityConfig.service;

import com.uyghurjava.thymeleafspringsecuritymysqlauth.securityConfig.secModel.AppUser;
import com.uyghurjava.thymeleafspringsecuritymysqlauth.securityConfig.secModel.Role;


public interface AppUserService {

    AppUser findByUsername(String username);

    Role findByName(String name);

    AppUser saveUser(AppUser appUser);

    Role saveRole(Role role);

    Role loadRoleByName(String roleName);

    void addRoleToUser(String username, String roleName);



}
