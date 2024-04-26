package br.edu.ipog.ecommerce.northwind.repository;

import br.edu.ipog.ecommerce.northwind.model.Category;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.lang.annotation.Native;
import java.util.List;

@Repository
public interface CategoryRepository extends JpaRepository<Category, Integer> {

    Category getCategoryById(Integer id);

    //@Query("SELECT category,product FROM Category category LEFT JOIN FETCH category.productList product WHERE category.active IS NOT NULL ") //JQPL
    @Query("SELECT c FROM Category c LEFT JOIN FETCH c.productList WHERE c.name IS NOT NULL") //JQPL
    List<Category> findCategoryActiveJPQL();

    @Query(
            value = "SELECT * from CATEGORY c WHERE c.active IS NOT NULL",
            nativeQuery = true //SQL NATIVO
    )
    List<Category> findCategoryActiveSQL();


    @Query(
            value = "SELECT * from CATEGORY c WHERE c.name LIKE %:name%",
            nativeQuery = true
    )
    List<Category> findCategoriesByName(@Param("name") String name);

    Category findByName(String name);

}
