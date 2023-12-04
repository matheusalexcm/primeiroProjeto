package com.br.primeiroProjeto.demo;

import com.br.primeiroProjeto.demo.model.Order;
import com.br.primeiroProjeto.demo.service.OrderService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Locale;
import java.util.Scanner;

@SpringBootApplication
public class PrimeiroProjetoApplication {

	public static void main(String[] args) {
		//SpringApplication.run(PrimeiroProjetoApplication.class, args);
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		Order order = new Order();
		OrderService service = new OrderService();

		System.out.println("Informe o código do pedido:");
		order.setCode(sc.nextInt());
		System.out.println("Informe o valor do produto:");
		order.setBasic(sc.nextDouble());
		System.out.println("Informe a porcentagem de desconto:");
		order.setDiscount(sc.nextDouble());

		System.out.println("Pedido código " + order.getCode());
		System.out.printf("Valor total: R$ %.2f%n", service.total(order));

	}

}
