package br.edu.ipog.ecommerce.northwind.model;

import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDate;
import java.time.LocalDateTime;

@Data
@Entity
@Table(name = "EMPLOYEES_DETAILS")
public class EmployeeDetail {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "ID")
    private Integer id;

    @Column(name = "FIRST_NAME", length = 150, nullable = false)
    private String firstName;

    @Column(name = "LAST_NAME", length = 150)
    private String lastName;

    @Column(name = "TITLE", length = 100)
    private String title;

    @Column(name = "TITLE_OF_COURTESY", length = 100)
    private String titleOfCourtesy;

    @Column(name = "BIRTH_DATE", nullable = false)
    private LocalDate birthDate;

    @Column(name = "NOTES", columnDefinition = "TEXT")
    private String notes;

    //Relacionamento 1 para 1
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "employee_id", referencedColumnName = "id")
    private Employee employee;
}
