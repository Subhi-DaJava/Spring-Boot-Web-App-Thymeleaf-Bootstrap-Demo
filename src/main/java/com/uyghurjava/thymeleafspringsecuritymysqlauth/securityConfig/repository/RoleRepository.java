package com.uyghurjava.thymeleafspringsecuritymysqlauth.securityConfig.repository;

import com.uyghurjava.thymeleafspringsecuritymysqlauth.securityConfig.secModel.Role;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RoleRepository extends JpaRepository<Role, Integer>  {
    Role findByName(String roleName);
}
