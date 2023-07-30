package app.abdulkader.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import app.abdulkader.model.Employee;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long> {
}
