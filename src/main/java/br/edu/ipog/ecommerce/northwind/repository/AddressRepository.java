package br.edu.ipog.ecommerce.northwind.repository;

import br.edu.ipog.ecommerce.northwind.model.Address;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AddressRepository extends JpaRepository<Address, Integer> {
}
