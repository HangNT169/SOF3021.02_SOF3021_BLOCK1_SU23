package com.fpt.poly.sof3021.B8_JPA.repository;

import com.fpt.poly.sof3021.B8_JPA.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface Productrepository extends JpaRepository<Product,Long> {
}
