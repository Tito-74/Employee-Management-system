package github.com.Tito74.EmployeeManagement.service.serviceImplement;

import github.com.Tito74.EmployeeManagement.entity.Employee;
import github.com.Tito74.EmployeeManagement.repo.EmployeeRepo;
import github.com.Tito74.EmployeeManagement.service.EmployeeService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EmployeeServiceImpl implements EmployeeService {

    private final EmployeeRepo employeeRepo;

    public EmployeeServiceImpl(EmployeeRepo employeeRepo) {
        this.employeeRepo = employeeRepo;
    }

    @Override
    public List<Employee> findAllEmployee() {
        return employeeRepo.findAll();
    }

    @Override
    public Optional<Employee> findById(Long id) {
        return employeeRepo.findById(id);
    }

    @Override
    public Employee saveEmployeeDetails(Employee employee) {
        return employeeRepo.save(employee);
    }

    @Override
    public Employee UpdateEmployeeDetails(Employee employee) {
        return employeeRepo.save(employee);
    }

    @Override
    public void deleteEmployeeDetails(Long id) {
        employeeRepo.deleteById(id);
    }
}
