package br.edu.ipog.ecommerce.northwind.model.embeddablemodels;

import br.edu.ipog.ecommerce.northwind.model.Category;
import br.edu.ipog.ecommerce.northwind.model.Picture;
import br.edu.ipog.ecommerce.northwind.model.embeddableids.PictureCategoryId;
import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDateTime;


@Data
@Entity
@Table(name = "pictures_categories")
public class PicturesCategory {
    //@Id
    //private Integer id;

    @EmbeddedId
    private PictureCategoryId pictureCategoryId;

    @Column(name = "DATE_REGISTER" , nullable = false)
    private LocalDateTime dateRegister;

    @Column(name = "CLOSE_REGISTER")
    private LocalDateTime closeRegister;

    //Relacionamentos @ManyToOne
    @ManyToOne
    @MapsId("pictureId") //Este nome deve corresponder ao nome do atributo em PictureCategoryId
    @JoinColumn(name = "picture_id")
    private Picture picture;

    @ManyToOne
    @MapsId("categoryId") //Este nome deve corresponder ao nome do atributo em PictureCategoryId
    @JoinColumn(name = "category_id")
    private Category category;


}
