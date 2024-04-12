package br.edu.ipog.ecommerce.northwind.model.embeddablemodels;

import br.edu.ipog.ecommerce.northwind.model.Order;
import br.edu.ipog.ecommerce.northwind.model.Product;
import br.edu.ipog.ecommerce.northwind.model.embeddableids.OrderDetailId;
import jakarta.persistence.*;
import lombok.Data;

import java.math.BigDecimal;

@Data
@Entity
@Table(name = "orders_details")
public class OrderDetail {

    @EmbeddedId
    private OrderDetailId orderDetailId;

    @Column(name = "unit_price", columnDefinition = "decimal(12,2)", nullable = false)
    private BigDecimal unitPrice;

    @Column(name = "quantity", nullable = false)
    private Integer quantity;

    @Column(name = "discount", precision = 12, scale = 2)
    private BigDecimal discount;

    //Fazer relacionamentos N-1

    @ManyToOne(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    @MapsId("orderId")
    @JoinColumn(name = "order_id")
    private Order order;

    @ManyToOne(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    @MapsId("productId")
    @JoinColumn(name = "product_id")
    private Product product;




}
