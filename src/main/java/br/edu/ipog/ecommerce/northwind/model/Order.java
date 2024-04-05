package br.edu.ipog.ecommerce.northwind.model;

import jakarta.persistence.*;
import lombok.Data;

import javax.print.attribute.standard.MediaSize;
import java.time.LocalDateTime;

@Data
@Entity
@Table(name = "ORDER")
public class Order {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "ID")
    private Integer id;

    @Column(name = "DATE_REGISTER" , nullable = false)
    private LocalDateTime dateRegister;

    @Column(name = "CLOSE_REGISTER")
    private LocalDateTime closeRegister;


}
