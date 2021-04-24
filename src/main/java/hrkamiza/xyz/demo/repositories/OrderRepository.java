package hrkamiza.xyz.demo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import hrkamiza.xyz.demo.entities.Order;

public interface OrderRepository  extends JpaRepository<Order, Long	>{

}
