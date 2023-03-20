package com.api_rest.lentti.repository;

import com.api_rest.lentti.model.Products;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IProduct extends JpaRepository<Products,Integer> {
}
