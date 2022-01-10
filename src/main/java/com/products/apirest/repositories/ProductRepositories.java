package com.products.apirest.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.products.apirest.models.Product;

public interface ProductRepositories extends JpaRepository<Product, Long> {

}
