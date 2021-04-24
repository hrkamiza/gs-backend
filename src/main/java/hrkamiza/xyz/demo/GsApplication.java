package hrkamiza.xyz.demo;

import java.time.Instant;
import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import hrkamiza.xyz.demo.entities.Order;
import hrkamiza.xyz.demo.entities.OrderItem;
import hrkamiza.xyz.demo.entities.Product;
import hrkamiza.xyz.demo.repositories.OrderItemRepository;
import hrkamiza.xyz.demo.repositories.OrderRepository;
import hrkamiza.xyz.demo.repositories.ProductRepository;

@SpringBootApplication
public class GsApplication implements CommandLineRunner {

	@Autowired
	private ProductRepository productRepository;

	@Autowired
	private OrderRepository orderRepository;

	@Autowired
	private OrderItemRepository orderItemRepository;

	public static void main(String[] args) {
		SpringApplication.run(GsApplication.class, args);
	}

	public void run(String... args) throws Exception {

		Product p1 = new Product(null, "Heineken 300ml", 2.80);
		Product p2 = new Product(null, "Skol 300ml", 3.20);
		productRepository.saveAll(Arrays.asList(p1, p2));

		Order order1 = new Order(null, Instant.parse("2021-04-18T11:25:09Z"));
		Order order2 = new Order(null, Instant.parse("2021-05-18T12:25:09Z"));

		orderRepository.saveAll(Arrays.asList(order1, order2));

		OrderItem oi1 = new OrderItem(null, 23, 3.20, p2, order1);
		OrderItem oi2 = new OrderItem(null, 10, 2.80, p1, order1);

		orderItemRepository.saveAll(Arrays.asList(oi1, oi2));

	}

}
