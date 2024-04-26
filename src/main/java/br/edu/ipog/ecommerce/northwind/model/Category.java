package br.edu.ipog.ecommerce.northwind.model;

import br.edu.ipog.ecommerce.northwind.model.embeddablemodels.PicturesCategory;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@Entity
@Table(name = "CATEGORIES")
@AllArgsConstructor
@NoArgsConstructor
public class Category {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "ID")
    private Integer id;

    @Column(name = "NAME", length = 100, nullable = false)
    private String name;

    @Column(name = "DESCRIPTION", columnDefinition = "TEXT", nullable = false)
    private String description;

    //@Lob //armazenda 'binário no banco de dados'
    @Column(name = "PICTURE", nullable = false)
    private byte[] picture;

    @Column(name = "ACTIVE", nullable = false)
    private Boolean active;

    /*
    //TODO Tipo de relacionamento que  NÃO PRECISA FAZER
    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, orphanRemoval = true)
    private List<PicturesCategory> picturesCategoryList;
    */
    @OneToMany(cascade = CascadeType.ALL,
            fetch = FetchType.LAZY,
            mappedBy = "category",
            orphanRemoval = true)
    private List<Product> productList;

    public Category(Integer id, String name){
        this.id = id;
        this.name = name;
    }

    public Category(Integer id, String name, List<Product> productList){
        this.id = id;
        this.name = name;
        this.productList = productList;
    }

}
