package com.api_rest.lentti.repository;

import com.api_rest.lentti.model.Orders;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IOrder extends JpaRepository<Orders, Integer> {
}
