package br.edu.ipog.ecommerce.northwind.repository;

import br.edu.ipog.ecommerce.northwind.model.Order;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OrderRepository extends JpaRepository<Order, Integer> {
}
