package com.uyghurjava.thymeleafspringsecuritymysqlauth.service;

import com.uyghurjava.thymeleafspringsecuritymysqlauth.model.Employee;

import java.util.List;

public interface EmployeeService {
    List<Employee> findAll();

    Employee findById(int empId);
    void save(Employee employee);

    void delete(int empId);

    List<Employee>  searchBy(String empName);
}
