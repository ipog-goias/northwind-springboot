package br.edu.ipog.ecommerce.northwind.repository;

import br.edu.ipog.ecommerce.northwind.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Integer> {
}
