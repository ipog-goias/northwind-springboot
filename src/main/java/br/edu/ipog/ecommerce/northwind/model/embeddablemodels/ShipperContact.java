package br.edu.ipog.ecommerce.northwind.model.embeddablemodels;

import br.edu.ipog.ecommerce.northwind.model.Contact;
import br.edu.ipog.ecommerce.northwind.model.Shipper;
import br.edu.ipog.ecommerce.northwind.model.embeddableids.ShipperContactId;
import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDateTime;

@Data
@Entity
@Table(name = "shippers_contacts")
public class ShipperContact {

    @EmbeddedId
    private ShipperContactId shipperContactId;

    @Column(name = "DATE_REGISTER" , nullable = false)
    private LocalDateTime dateRegister;

    @Column(name = "CLOSE_REGISTER")
    private LocalDateTime closeRegister;

    //Fazer mapeamento dos relacionamentos
    @ManyToOne(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    @MapsId("shipperId")
    @JoinColumn(name = "shipper_id")
    private Shipper shipper;

    @ManyToOne(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    @MapsId("contactId")
    @JoinColumn(name = "contact_id")
    private Contact contact;

}
