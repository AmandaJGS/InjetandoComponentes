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
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o código do produto:");
        Integer cod = scanner.nextInt();

        System.out.println("Digite o valor do produto:");
        double valor = scanner.nextDouble();

        System.out.println("Digite o  valor do desconto do produto:");
        double desconto = scanner.nextDouble();

        Order obj = new Order(cod, valor,desconto);
        Double resulte = orderService.total(obj);
        Order order = new Order(cod,resulte,desconto);
        Double rest = shippingService.shipment(order);

        System.out.println("Pedido código " + cod);
        System.out.println("Valor total: " + rest);
    }

}
