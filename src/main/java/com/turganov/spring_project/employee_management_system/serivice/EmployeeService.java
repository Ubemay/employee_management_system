package com.turganov.spring_project.employee_management_system.serivice;

import com.turganov.spring_project.employee_management_system.entity.Employee;

import java.util.List;

public interface EmployeeService {

    List<Employee> getAllEmployees();

    Employee saveEmployee(Employee employee);

    Employee editStudent(Employee employee);

    Employee getEmployeeById(Long id);

    void deleteEmployee(Long id);

}
