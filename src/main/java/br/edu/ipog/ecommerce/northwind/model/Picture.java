package br.edu.ipog.ecommerce.northwind.model;

import br.edu.ipog.ecommerce.northwind.model.embeddablemodels.PictureProduct;
import br.edu.ipog.ecommerce.northwind.model.embeddablemodels.PicturesCategory;
import jakarta.persistence.*;
import lombok.Data;

import java.util.List;


@Data
@Entity
@Table(name = "PICTURES")
public class Picture {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    @Column(name = "PATH", columnDefinition = "TEXT", nullable = false)
    private String path;

    /*
    //TODO Tipo de relacionamento que  NÃO PRECISA FAZER
    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private List<PicturesCategory> picturesCategoryList;

    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private List<PictureProduct> pictureProductList;
     */
}
