package com.basicrestfulapi.app.Model.Repository;

import com.basicrestfulapi.app.Model.Entity.Product;
import org.springframework.data.repository.CrudRepository;

public interface ProductRepository extends CrudRepository<Product, Long> {
}
