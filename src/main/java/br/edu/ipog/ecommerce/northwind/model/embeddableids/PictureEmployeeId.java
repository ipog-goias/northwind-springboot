package br.edu.ipog.ecommerce.northwind.model.embeddableids;

import br.edu.ipog.ecommerce.northwind.model.Employee;
import br.edu.ipog.ecommerce.northwind.model.Picture;
import jakarta.persistence.Embeddable;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Embeddable
@Data
@AllArgsConstructor
@NoArgsConstructor
/**
 *
 * @apiNote  A anotação @Embeddable diz para o JPA que ele deve entender que
 * a classe PicturesCategories é uma classe comum e não é uma entity,
 *  ou seja, que ele irá gerenciar o estado dela.
 *
 *  Toda chave composta deve implementar Serializable
 *
 * @see https://docs.oracle.com/javaee%2F6%2Fapi%2F%2F/javax/persistence/EmbeddedId.html
 */
public class PictureEmployeeId implements Serializable {

    private Integer idPicture;

    private Integer idEmployee;
}
