package com.gravity9.springbootmongodbproducts.repository;

import com.gravity9.springbootmongodbproducts.domain.Product;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRepository extends MongoRepository<Product, Integer> {

}
