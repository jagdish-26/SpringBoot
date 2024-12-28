package com.telusko.ecom_proj;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.telusko.ecom_proj.controller.ProductController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class EcomProjApplication {

	public static void main(String[] args) {

		ApplicationContext  context= SpringApplication.run(EcomProjApplication.class, args);

		ProductController controller=context.getBean(ProductController.class);


	}

}

