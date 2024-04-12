package br.edu.ipog.ecommerce.northwind.model.embeddablemodels;

import br.edu.ipog.ecommerce.northwind.model.Picture;
import br.edu.ipog.ecommerce.northwind.model.Product;
import br.edu.ipog.ecommerce.northwind.model.embeddableids.PictureProductId;
import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDateTime;

@Data
@Entity
@Table(name = "pictures_products")
public class PictureProduct {

    @EmbeddedId
    private PictureProductId pictureProductId;

    @Column(name = "DATE_REGISTER" , nullable = false)
    private LocalDateTime dateRegister;

    @Column(name = "CLOSE_REGISTER")
    private LocalDateTime closeRegister;

    //fazer o vínculo
    @ManyToOne(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    @MapsId("pictureId")
    @JoinColumn(name = "picture_id")
    private Picture picture;

    @ManyToOne(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    @MapsId("productId")
    @JoinColumn(name = "product_id")
    private Product product;



}
