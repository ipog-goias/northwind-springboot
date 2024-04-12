package br.edu.ipog.ecommerce.northwind.model.embeddableids;

import jakarta.persistence.Embeddable;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Embeddable
@Data
@AllArgsConstructor
@NoArgsConstructor
public class OrderEmployeeId implements Serializable {

    private Integer orderId;

    private Integer employeeId;
}
