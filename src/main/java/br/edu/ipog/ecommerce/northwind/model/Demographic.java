package br.edu.ipog.ecommerce.northwind.model;

import jakarta.persistence.*;
import lombok.Data;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Data
@Entity
@Table(name = "DEMOGRAPHICS")
public class Demographic {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "ID")
    private Integer id;

    @Column(name = "LONG", precision = 12, scale = 8,  nullable = false)
    //@Column(name="LONG", columnDefinition="Decimal(12,8) default '0.00'")
    private Float longitude;

    @Column(name = "LAT", precision = 12, scale = 8,  nullable = false)
    //@Column(name="LAT", columnDefinition="Decimal(12,8) default '0.00'")
    private Float lat;

    @Column(name = "DESCRIPTION", length = 150)
    private String description;

    @Column(name = "DATE_REGISTER" , nullable = false)
    private LocalDateTime dateRegister;

    @Column(name = "CLOSE_REGISTER")
    private LocalDateTime closeRegister;



}
