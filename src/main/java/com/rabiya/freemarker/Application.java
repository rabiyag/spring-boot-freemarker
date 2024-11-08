package com.rabiya.freemarker;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.rabiya.freemarker.model.Employee;
import com.rabiya.freemarker.repository.EmployeeRepository;


@SpringBootApplication
public class Application implements CommandLineRunner {

	@Autowired
	private EmployeeRepository employeeRepository;

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

		employeeRepository.save(new Employee("Alan", "Binu", "alan@gmail.com"));
		employeeRepository.save(new Employee("Tom", "Cruise", "tom@gmail.com"));
		employeeRepository.save(new Employee("John", "Cena", "john@gmail.com"));
		employeeRepository.save(new Employee("tony", "stark", "stark@gmail.com"));
		// get list of employees
		List<Employee> employees = employeeRepository.findAll();
		employees.forEach(employee -> System.out.println(employee.toString()));
	}
}
