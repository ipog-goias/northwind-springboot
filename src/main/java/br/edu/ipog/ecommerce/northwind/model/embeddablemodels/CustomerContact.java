package br.edu.ipog.ecommerce.northwind.model.embeddablemodels;

import br.edu.ipog.ecommerce.northwind.model.Contact;
import br.edu.ipog.ecommerce.northwind.model.Customer;
import br.edu.ipog.ecommerce.northwind.model.embeddableids.CustomerContactId;
import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDateTime;

@Data
@Entity
@Table(name = "customers_contacts")
public class CustomerContact {

    @EmbeddedId
    private CustomerContactId customerContactId;

    @Column(name = "DATE_REGISTER" , nullable = false)
    private LocalDateTime dateRegister;

    @Column(name = "CLOSE_REGISTER")
    private LocalDateTime closeRegister;

    //Fazer relacionamentos
    @ManyToOne(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    @MapsId("customerId")
    @JoinColumn(name = "customer_id")
    private Customer customer;

    @ManyToOne(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    @MapsId("contactId")
    @JoinColumn(name = "contact_id")
    private Contact contact;

}
