package br.edu.ipog.ecommerce.northwind.model.embeddablemodels;

import br.edu.ipog.ecommerce.northwind.model.Employee;
import br.edu.ipog.ecommerce.northwind.model.Order;
import br.edu.ipog.ecommerce.northwind.model.embeddableids.OrderEmployeeId;
import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDateTime;

@Data
@Entity
@Table(name = "orders_employees")
public class OrderEmployee {

    @EmbeddedId
    private OrderEmployeeId orderEmployeeId;

    @Column(name = "DATE_REGISTER" , nullable = false)
    private LocalDateTime dateRegister;

    @Column(name = "CLOSE_REGISTER")
    private LocalDateTime closeRegister;

    //fazer vínculo entre EmbeddedId e as classes que fazem relacionamento N-1
    @ManyToOne
    @MapsId("orderId") //faz vínculo com OrderEmployeeId;
    @JoinColumn(name = "order_id")
    private Order order;

    @ManyToOne
    @MapsId("employeeId") //faz vínculo com OrderEmployeeId;
    @JoinColumn(name = "employee_id")
    private Employee employee;
}
