package com.devsuperior.InjecaoComponentes;

import com.devsuperior.InjecaoComponentes.entities.Order;
import com.devsuperior.InjecaoComponentes.services.OrderService;
import com.devsuperior.InjecaoComponentes.services.ShippingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Scanner;

@SpringBootApplication
public class InjecaoComponentesApplication implements CommandLineRunner {

    @Autowired
    private OrderService orderService;
    @Autowired
    private ShippingService shippingService;

	public static void main(String[] args) {
		SpringApplication.run(InjecaoComponentesApplication.class, args);
	}

    @Override
    public void run(String... args) throws Exception{

        Order order = new Order(1034, 150.00, 20.00);
        double total = orderService.total(order);

        Order order2 = new Order(2282, 800.00, 10.00);
        double total2 = orderService.total(order2);

        Order order3 = new Order(1309, 95.90, 0.0);
        double total3 = orderService.total(order3);

        System.out.println("Pedido código " + order.getCode());
        System.out.printf("Valor total: R$ %.2f%n", total);

        System.out.println("Pedido código " + order2.getCode());
        System.out.printf("Valor total: R$ %.2f%n", total2);

        System.out.println("Pedido código " + order3.getCode());
        System.out.printf("Valor total: R$ %.2f%n", total3);
    }

}
