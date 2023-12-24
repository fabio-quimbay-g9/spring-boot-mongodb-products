package com.gravity9.springbootmongodbproducts.service;

import com.gravity9.springbootmongodbproducts.domain.Product;
import com.gravity9.springbootmongodbproducts.domain.model.CrudService;
import com.gravity9.springbootmongodbproducts.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collection;
import java.util.List;

@Service
public  class ProductService   implements CrudService<Product> {

    @Autowired
    ProductRepository repository;

    @Override
    public void create(Product product) {
        repository.save(product);
    }

    @Override
    public void update(String id, Product product) {
    }

    @Override
    public void delete(String id) {
    }

    @Override
    public Collection<Product> getItem() {
        return null;
    }

    @Override
    public List<Product> getAllItems() {
        return repository.findAll();
    }
}
