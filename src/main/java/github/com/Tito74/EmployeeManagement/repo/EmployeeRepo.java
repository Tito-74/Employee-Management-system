package github.com.Tito74.EmployeeManagement.repo;

import github.com.Tito74.EmployeeManagement.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeRepo extends JpaRepository <Employee, Long> {
}
