package com.uyghurjava.thymeleafspringsecuritymysqlauth.service;

import com.uyghurjava.thymeleafspringsecuritymysqlauth.model.Employee;
import com.uyghurjava.thymeleafspringsecuritymysqlauth.repository.EmployeeRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EmployeeServiceImpl implements EmployeeService {

    private EmployeeRepository employeeRepository;

    public EmployeeServiceImpl(EmployeeRepository employeeRepository) {
        this.employeeRepository = employeeRepository;
    }

    @Override
    public List<Employee> findAll() {
        return employeeRepository.findAllByOrderByLastNameAsc();
    }

    @Override
    public Employee findById(int empId) {
        Employee employee = employeeRepository.findById(empId).orElse(null);
        Employee searchEmployee = null;

        if(employee != null){
            searchEmployee = employee;
        } else {
            throw new RuntimeException("This employee with empId=" + empId + " doesn't exit in DB");
        }

        return searchEmployee;
    }

    @Override
    public void save(Employee employee) {
        employeeRepository.save(employee);
    }

    @Override
    public void deleteById(int empId) {
        employeeRepository.deleteById(empId);
    }

    @Override
    public List<Employee> searchBy(String empName) {

        List<Employee> listEmp = null;

        if(empName != null && (empName.trim().length() > 0)){
            listEmp = employeeRepository.findByFirstNameContainsOrLastNameContainsAllIgnoreCase(empName, empName);
        } else {
            listEmp = findAll();
        }
        return listEmp;
    }
}
