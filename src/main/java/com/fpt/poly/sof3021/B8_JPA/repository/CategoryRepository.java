package com.fpt.poly.sof3021.B8_JPA.repository;

import com.fpt.poly.sof3021.B8_JPA.entity.Category;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CategoryRepository extends JpaRepository<Category, Long> {

    // CRUD 1 bang => K CAN PHAN VIET
    // Co 2 cach tu custom query
    // C1: Query Creation
    // C2: @Query(raw sql)
    // https://viblo.asia/p/spring-boot-12-spring-jpa-method-atquery-Qbq5Q4nGlD8

    // C1: Ten ham phai dung cu phap => Dai
    List<Category> findCategoryByCategoryName1AndId(String categoryName, Long id);

    // C2: @Query
    // C2.1: JPQL => JPA Query Language <=> Tuong tu HQL(Hibernate Query Language)
    // Default native = false
    @Query("SELECT c FROM Category c WHERE c.categoryName1 LIKE ?2 AND c.id = ?1")
    List<Category> search(Long id, String categoryName);
    // C2.2: Native Query
    // native query = true
    // => Truy van tren SQL
    @Query(value = "SELECT * FROM category WHERE category_name LIKE ?2 AND id = ?1",nativeQuery = true)
    List<Category> search1(Long id, String categoryName);

}
