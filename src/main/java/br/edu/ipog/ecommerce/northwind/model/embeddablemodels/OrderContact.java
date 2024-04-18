package br.edu.ipog.ecommerce.northwind.model.embeddablemodels;

import br.edu.ipog.ecommerce.northwind.model.Contact;
import br.edu.ipog.ecommerce.northwind.model.Order;
import br.edu.ipog.ecommerce.northwind.model.embeddableids.OrderContactId;
import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDateTime;

@Data
@Entity
@Table(name = "orders_contacts" )
public class OrderContact {

    @EmbeddedId
    private OrderContactId orderContactId;

    @Column(name = "DATE_REGISTER" , nullable = false)
    private LocalDateTime dateRegister;

    @Column(name = "CLOSE_REGISTER")
    private LocalDateTime closeRegister;

    //Fazer os relacionamentos
    @ManyToOne(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    @MapsId("orderId")
    @JoinColumn(name = "order_id")
    private Order order;

    @ManyToOne(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    @MapsId("contactId")
    @JoinColumn(name = "contact_id")
    private Contact contact;


}
