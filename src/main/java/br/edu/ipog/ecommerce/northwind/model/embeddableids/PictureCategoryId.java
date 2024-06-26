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
public class PictureCategoryId implements Serializable {

    private Integer categoryId;

    private Integer pictureId;
}
