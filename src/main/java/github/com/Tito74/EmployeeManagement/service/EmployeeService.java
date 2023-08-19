package github.com.Tito74.EmployeeManagement.service;

import github.com.Tito74.EmployeeManagement.entity.Employee;

import java.util.List;
import java.util.Optional;

public interface EmployeeService {
    List<Employee> findAllEmployee();
    Optional<Employee> findById(Long id);
    Employee saveEmployeeDetails(Employee employee);
    Employee UpdateEmployeeDetails(Employee employee);
    void deleteEmployeeDetails(Long id);

}
