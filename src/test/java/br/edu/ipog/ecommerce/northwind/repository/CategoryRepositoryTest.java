package br.edu.ipog.ecommerce.northwind.repository;

import br.edu.ipog.ecommerce.northwind.model.Category;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.autoconfigure.orm.jpa.TestEntityManager;

import static org.assertj.core.api.Assertions.assertThat;

@DataJpaTest
@AutoConfigureTestDatabase(replace = AutoConfigureTestDatabase.Replace.NONE)
public class CategoryRepositoryTest {

    @Autowired
    private CategoryRepository categoryRepository;

    @Autowired
    private TestEntityManager entityManager;

    @BeforeEach
    public void setUp() {
        // Test
        Category category = new Category();
        category.setName("nome categoria");
        category.setDescription("descricao categoria");
        category.setPicture(new byte[10]);
        category.setActive(true);

        //entityManager.persist(category);
        categoryRepository.save(category);
    }

    @Test
    public void whenFindByCategoryName_thenReturnCategory() {
        //given
        String name = "nome categoria";

        //when
        Category encontrado = categoryRepository.findByName(name);

        //then

        assertThat(encontrado.getName()).isEqualTo(name);
    }

}
