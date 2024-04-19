package br.edu.ipog.ecommerce.northwind.model;

import br.edu.ipog.ecommerce.northwind.model.embeddablemodels.CustomerContact;
import br.edu.ipog.ecommerce.northwind.model.embeddablemodels.SupplierContact;
import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDateTime;
import java.util.List;

@Data
@Entity
@Table(name = "SUPPLIERS")
public class Supplier {

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

    @OneToMany(mappedBy = "supplier",
            cascade = CascadeType.ALL,
            fetch = FetchType.LAZY, orphanRemoval = true)
    private List<Product> productList;

    /*
    //TODO Tipo de relacionamento que  NÃO PRECISA FAZER
    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private List<SupplierContact> supplierContactList;
     */

}
