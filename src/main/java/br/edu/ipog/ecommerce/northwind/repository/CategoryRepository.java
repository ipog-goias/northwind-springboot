package br.edu.ipog.ecommerce.northwind.repository;

import br.edu.ipog.ecommerce.northwind.model.Category;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CategoryRepository extends JpaRepository<Category, Integer> {

    List<Category> findCategoriesByDescriptionAndAndName();

    @Query("SELECT new Category(c.id,c.name) from Category c where c.name is not null ")
    List<Category> findCategoryActive();
}
