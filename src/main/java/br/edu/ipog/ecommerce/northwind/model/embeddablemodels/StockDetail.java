package br.edu.ipog.ecommerce.northwind.model.embeddablemodels;

import br.edu.ipog.ecommerce.northwind.model.Product;
import br.edu.ipog.ecommerce.northwind.model.Stock;
import br.edu.ipog.ecommerce.northwind.model.embeddableids.StockDetailId;
import jakarta.persistence.*;
import lombok.Data;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Data
@Entity
@Table(name = "stock_details")
public class StockDetail {

    @EmbeddedId
    private StockDetailId stockDetailId;

    @Column(name = "DATE_REGISTER" , nullable = false)
    private LocalDateTime dateRegister;

    @Column(name = "CLOSE_REGISTER")
    private LocalDateTime closeRegister;

    @Column(name = "unit_price", precision = 12, scale = 2)
    private BigDecimal unitPrice;

    //fazer relacionamentos
    @ManyToOne(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    @MapsId("productId")
    @JoinColumn(name = "product_id")
    private Product product;

    @ManyToOne(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    @MapsId("stockId")
    @JoinColumn(name = "stock_id")
    private Stock stock;


}
