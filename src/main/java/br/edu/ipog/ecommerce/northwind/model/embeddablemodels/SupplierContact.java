package br.edu.ipog.ecommerce.northwind.model.embeddablemodels;

import br.edu.ipog.ecommerce.northwind.model.Contact;
import br.edu.ipog.ecommerce.northwind.model.Supplier;
import br.edu.ipog.ecommerce.northwind.model.embeddableids.SupplierContactId;
import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDateTime;

@Data
@Entity
@Table(name = "supplier_contact")
public class SupplierContact {

    @EmbeddedId
    private SupplierContactId supplierContactId;

    @Column(name = "DATE_REGISTER" , nullable = false)
    private LocalDateTime dateRegister;

    @Column(name = "CLOSE_REGISTER")
    private LocalDateTime closeRegister;

    //Fazer relacionamento
    @ManyToOne(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    @MapsId("supplierId")
    @JoinColumn(name = "supplier_id")
    private Supplier supplier;

    @ManyToOne(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    @MapsId("contactId")
    @JoinColumn(name = "contact_id")
    private Contact contact;


}
