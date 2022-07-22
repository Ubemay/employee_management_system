package com.turganov.spring_project.employee_management_system;

import com.turganov.spring_project.employee_management_system.entity.Employee;
import com.turganov.spring_project.employee_management_system.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class EmployeeManagementSystemApplication implements CommandLineRunner {

    public static void main(String[] args) {
        SpringApplication.run(EmployeeManagementSystemApplication.class, args);
    }


    @Autowired
    private EmployeeRepository employeeRepository;


    @Override
    public void run(String... args) throws Exception {

      /*  Employee employee1 = new Employee("Rustambek", "Turganov", "test@abc.com");
        employeeRepository.save(employee1);

        Employee employee2 = new Employee("Ivan", "Ivanov", "ivan@gmail.com");
        employeeRepository.save(employee2);

        Employee employee3 = new Employee("Olga", "Ivanova", "olga@gmail.com");
        employeeRepository.save(employee3);
*/

    }
}
