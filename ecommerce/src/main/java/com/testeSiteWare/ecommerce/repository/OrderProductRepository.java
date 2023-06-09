package com.testeSiteWare.ecommerce.repository;



import com.testeSiteWare.ecommerce.model.OrderProduct;
import com.testeSiteWare.ecommerce.model.OrderProductPK;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface OrderProductRepository extends CrudRepository<OrderProduct, OrderProductPK> {
}