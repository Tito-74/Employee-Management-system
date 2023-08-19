package github.com.Tito74.EmployeeManagement.controller;

import github.com.Tito74.EmployeeManagement.entity.Employee;
import github.com.Tito74.EmployeeManagement.service.EmployeeService;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/employee")
public class EmployeeController {
//    @Autowired

    private final EmployeeService employeeService;

    public EmployeeController(EmployeeService employeeService) {
        this.employeeService = employeeService;
    }

    @GetMapping
    public List <Employee> findAllEmployee(){
        return employeeService.findAllEmployee();
    }
    @GetMapping("/{id}")
    public Optional<Employee> findEmployeeById(@PathVariable("id") Long id){
        return employeeService.findById(id);
    }

    @PostMapping
    public Employee saveEmployeeDetails(@RequestBody Employee employee){
        return employeeService.saveEmployeeDetails(employee);
    }

    @PutMapping
    public Employee updateEmployeeDetails(@RequestBody Employee employee){
        return employeeService.UpdateEmployeeDetails( employee);
    }

    @DeleteMapping("/{id}")
    public void deleteEmployeeDetails(@PathVariable("id") Long id){
        employeeService.deleteEmployeeDetails(id);
    }

}
