package br.edu.ipog.ecommerce.northwind.model;

import br.edu.ipog.ecommerce.northwind.model.embeddablemodels.EmployeeContact;
import br.edu.ipog.ecommerce.northwind.model.embeddablemodels.OrderShipper;
import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;

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

    //Auto-relacionamento
    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    @JoinColumn(name = "employee_id", referencedColumnName = "id")
    private List<Employee> children;

    //Relacionamento 1 para 1
    @OneToOne(mappedBy = "employee")
    private EmployeeDetail detail;

    //TODO Tipo de relacionamento que  NÃO PRECISA FAZER
    /*@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private List<EmployeeContact> employeeContactList;*/

}
