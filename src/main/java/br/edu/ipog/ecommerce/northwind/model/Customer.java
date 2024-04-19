package br.edu.ipog.ecommerce.northwind.model;

import br.edu.ipog.ecommerce.northwind.model.embeddablemodels.CustomerContact;
import br.edu.ipog.ecommerce.northwind.model.embeddablemodels.OrderShipper;
import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDateTime;
import java.util.List;

@Data
@Entity
@Table(name = "CUSTOMERS")
public class Customer {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "ID")
    private Integer id;

    @Column(name = "NAME", length = 150, nullable = false)
    private String name;

    @Column(name = "DATE_REGISTER" , nullable = false)
    private LocalDateTime dateRegister;

    @Column(name = "CLOSE_REGISTER")
    private LocalDateTime closeRegister;

    /*
    //TODO Tipo de relacionamento que  NÃO PRECISA FAZER
    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private List<CustomerContact> customerContactList;
     */


}
