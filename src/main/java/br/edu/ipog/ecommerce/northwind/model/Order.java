package br.edu.ipog.ecommerce.northwind.model;

import br.edu.ipog.ecommerce.northwind.model.embeddablemodels.OrderContact;
import br.edu.ipog.ecommerce.northwind.model.embeddablemodels.OrderCustomer;
import br.edu.ipog.ecommerce.northwind.model.embeddablemodels.OrderEmployee;
import br.edu.ipog.ecommerce.northwind.model.embeddablemodels.OrderShipper;
import jakarta.persistence.*;
import lombok.Data;

import javax.print.attribute.standard.MediaSize;
import java.time.LocalDateTime;
import java.util.List;

@Data
@Entity
@Table(name = "ORDERS")
public class Order {

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
    private List<OrderEmployee> orderEmployeeList;

    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private List<OrderShipper> orderShipperList;

    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private List<OrderCustomer> orderCustomerList;

    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private List<OrderContact> orderContactList;
    */
}
