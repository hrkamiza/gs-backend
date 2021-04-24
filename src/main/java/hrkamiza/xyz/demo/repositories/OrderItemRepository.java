package hrkamiza.xyz.demo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import hrkamiza.xyz.demo.entities.OrderItem;

public interface OrderItemRepository  extends JpaRepository<OrderItem, Long	>{

}
