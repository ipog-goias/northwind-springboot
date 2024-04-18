package br.edu.ipog.ecommerce.northwind.model.embeddableids;

import br.edu.ipog.ecommerce.northwind.model.Contact;
import br.edu.ipog.ecommerce.northwind.model.Order;
import jakarta.persistence.Embeddable;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@Embeddable
@AllArgsConstructor
@NoArgsConstructor
public class OrderContactId implements Serializable {

    private Order orderId;

    private Contact contactId;



}
