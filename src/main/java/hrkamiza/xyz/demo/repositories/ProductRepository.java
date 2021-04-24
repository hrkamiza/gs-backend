package hrkamiza.xyz.demo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import hrkamiza.xyz.demo.entities.Product;

public interface ProductRepository  extends JpaRepository<Product, Long	>{

}
