package mk.ukim.finki.wp.kol2022.g1.repository;

import mk.ukim.finki.wp.kol2022.g1.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {
    Employee findByEmail(String s);
}
