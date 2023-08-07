package com.programmingtechie.productservice.repository;

import com.programmingtechie.productservice.model.Product;
import org.springframework.data.mongodb.repository.MongoRepository;
    //two arguments, second one is the id of the product class
public interface ProductRepository extends MongoRepository<Product, String> {
}
