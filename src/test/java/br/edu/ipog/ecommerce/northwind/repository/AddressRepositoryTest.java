package br.edu.ipog.ecommerce.northwind.repository;

import br.edu.ipog.ecommerce.northwind.model.Address;
import br.edu.ipog.ecommerce.northwind.model.Category;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.autoconfigure.orm.jpa.TestEntityManager;

import java.time.LocalDateTime;

import static org.assertj.core.api.Assertions.assertThat;

@DataJpaTest
@AutoConfigureTestDatabase(replace = AutoConfigureTestDatabase.Replace.NONE)
public class AddressRepositoryTest {

    @Autowired
    private AddressRepository addressRepository;

    @BeforeEach
    public void setUp() {
        // Test
        /**
         * @see https://en.wikipedia.org/wiki/Fluent_interface
         */
        Address address = Address.builder()
                .info("IPOG GOIAS")
                .region("Centro-Oeste")
                .city("Goiânia")
                .postalCode("74000000")
                .country("Brasil")
                .dateRegister(LocalDateTime.now())
                .closeRegister(null).build();

        addressRepository.save(address);
    }

    @Test
    public void whenFindByCategoryName_thenReturnCategory() {
        //given
        String name = "nome categoria";

        //when
        //Category encontrado = addressRepository.findById(1)

        //then

        //assertThat(encontrado.getName()).isEqualTo(name);
    }
    @Test
    public void metodo1(){
        assertThat(true).isTrue();
    }

    @Test
    public void metodo2(){
        assertThat(true).isTrue();
    }

    @Test
    public void metodo3(){
        assertThat(true).isTrue();
    }

}
