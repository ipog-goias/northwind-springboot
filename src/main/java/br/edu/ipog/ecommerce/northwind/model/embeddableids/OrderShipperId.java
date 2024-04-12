package br.edu.ipog.ecommerce.northwind.model.embeddableids;

import jakarta.persistence.Embeddable;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@Embeddable
@NoArgsConstructor
@AllArgsConstructor
public class OrderShipperId implements Serializable {

    private Integer orderId;

    private Integer shipperId;
}
