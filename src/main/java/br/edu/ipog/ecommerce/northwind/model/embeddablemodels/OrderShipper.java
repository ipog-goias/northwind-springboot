package br.edu.ipog.ecommerce.northwind.model.embeddablemodels;


import br.edu.ipog.ecommerce.northwind.model.Order;
import br.edu.ipog.ecommerce.northwind.model.Shipper;
import br.edu.ipog.ecommerce.northwind.model.embeddableids.OrderShipperId;
import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDateTime;

@Data
@Entity
@Table(name = "orders_shippers")
public class OrderShipper {

    @EmbeddedId
    private OrderShipperId orderShipperId;

    @Column(name = "DATE_REGISTER" , nullable = false)
    private LocalDateTime dateRegister;

    @Column(name = "CLOSE_REGISTER")
    private LocalDateTime closeRegister;

    //Fazer relacionamentos N-1
    @ManyToOne (cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    @MapsId("orderId")
    @JoinColumn(name = "order_id")
    private Order order;

    @ManyToOne (cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    @MapsId("shipperId")
    @JoinColumn(name = "shipper_id")
    private Shipper shipper;



}
