package br.edu.ipog.ecommerce.northwind.model;

import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDateTime;

@Data
@Entity
@Table(name = "EMAILS")
public class Email {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "ID")
    private Integer id;

    @Column(name = "ADDRESS", length = 100, nullable = false)
    private String address;

    @Column(name = "DATE_REGISTER" , nullable = false)
    private LocalDateTime dateRegister;

    @Column(name = "CLOSE_REGISTER")
    private LocalDateTime closeRegister;



}
