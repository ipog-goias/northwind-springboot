package br.edu.ipog.ecommerce.northwind.model.embeddablemodels;

import br.edu.ipog.ecommerce.northwind.model.Employee;
import br.edu.ipog.ecommerce.northwind.model.Picture;
import br.edu.ipog.ecommerce.northwind.model.embeddableids.PictureEmployeeId;
import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDateTime;

@Data
@Entity
@Table(name = "pictures_employees")
public class PictureEmployee {

    @EmbeddedId //indica o uso de chave composta
    private PictureEmployeeId pictureEmployeeId;

    @Column(name = "DATE_REGISTER" , nullable = false)
    private LocalDateTime dateRegister;

    @Column(name = "CLOSE_REGISTER")
    private LocalDateTime closeRegister;

    //Fazer relacionamentos N-1 (@ManyToOne)
    @ManyToOne
    @MapsId("idPicture") //Verificar id da chave composta PictureEmployeeId
    @JoinColumn(name = "pictures_id")
    private Picture picture;

    @ManyToOne
    @MapsId("idEmployee") //Verificar id da chave composta PictureEmployeeId
    @JoinColumn(name = "emplyees_id")
    private Employee employee;
}
