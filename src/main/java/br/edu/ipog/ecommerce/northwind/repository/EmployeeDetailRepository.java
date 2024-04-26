package br.edu.ipog.ecommerce.northwind.repository;

import br.edu.ipog.ecommerce.northwind.model.Category;
import br.edu.ipog.ecommerce.northwind.model.EmployeeDetail;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeDetailRepository extends JpaRepository<EmployeeDetail, Integer> {
}
