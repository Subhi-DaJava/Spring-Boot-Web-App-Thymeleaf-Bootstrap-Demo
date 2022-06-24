package com.uyghurjava.thymeleafspringsecuritymysqlauth.repository;

import com.uyghurjava.thymeleafspringsecuritymysqlauth.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Integer> {

    List<Employee> findAllByOrderByLastNameAsc();

    List<Employee> findByFirstNameContainsOrLastNameContainsAllIgnoreCase(String name, String lastName);

}
