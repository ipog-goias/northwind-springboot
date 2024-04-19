package br.edu.ipog.ecommerce.northwind.model;

import br.edu.ipog.ecommerce.northwind.model.embeddablemodels.*;
import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDateTime;
import java.util.List;

@Data
@Entity
@Table(name = "CONTACTS")
public class Contact {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "ID")
    private Integer id;

    @Column(name = "DATE_REGISTER" , nullable = false)
    private LocalDateTime dateRegister;

    @Column(name = "CLOSE_REGISTER")
    private LocalDateTime closeRegister;

    /*
    //TODO Tipo de relacionamento que  NÃO PRECISA FAZER
    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private List<EmployeeContact> employeeContactList;

    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private List<ShipperContact> shipperContactList;

    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private List<CustomerContact> customerContactList;

    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private List<SupplierContact> supplierContactList;

    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private List<OrderContact> orderContactList;*/

    //Relacionamentos
    @OneToMany(cascade =  CascadeType.ALL, orphanRemoval = true, fetch = FetchType.LAZY)
    @JoinColumn(name = "demographic_id")
    private List<Demographic> demographics;

    @OneToMany(cascade =  CascadeType.ALL, orphanRemoval = true, fetch = FetchType.LAZY)
    @JoinColumn(name = "phone_id")
    private List<Phone> phones;

    @OneToMany(cascade =  CascadeType.ALL, orphanRemoval = true, fetch = FetchType.LAZY)
    @JoinColumn(name = "email_id")
    private List<Email> emails;

    @OneToMany(cascade =  CascadeType.ALL, orphanRemoval = true, fetch = FetchType.LAZY)
    @JoinColumn(name = "address_id")
    private List<Address> addresses;
}
