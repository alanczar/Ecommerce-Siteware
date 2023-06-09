package com.testeSiteWare.ecommerce.repository;


import com.testeSiteWare.ecommerce.model.Order;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OrderRepository extends CrudRepository<Order, Long> {
}