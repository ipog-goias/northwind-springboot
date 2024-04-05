package br.edu.ipog.ecommerce.northwind.model;

import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDate;
import java.time.LocalDateTime;

@Data
@Entity
@Table(name = "EMPLOYEES")
public class Employee {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "ID")
    private Integer id;

    @Column(name = "HIRE_DATE", nullable = false)
    private LocalDateTime hireDate;

    @Column(name = "RESIGNATION_DATE")
    private LocalDateTime resignationDate;

    //Relacionamento 1 para 1
    @OneToOne(mappedBy = "employee")
    private EmployeeDetail detail;

}
