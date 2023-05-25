package com.fpt.poly.sof3021.B8_JPA.repository;

import com.fpt.poly.sof3021.B8_JPA.entity.Category;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CategoryRepository extends JpaRepository<Category,Long> {
    // CRUD 1 bang => K CAN PHAN VIET
}
