package br.edu.ipog.ecommerce.northwind.model;

import jakarta.persistence.*;
import lombok.Data;


@Data
@Entity
@Table(name = "PICTURES")
public class Picture {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    @Column(name = "PATH", columnDefinition = "TEXT", nullable = false)
    private String path;

}
