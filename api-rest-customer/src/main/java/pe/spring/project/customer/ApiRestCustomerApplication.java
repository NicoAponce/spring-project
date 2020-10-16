package pe.spring.project.customer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@SpringBootApplication
public class ApiRestCustomerApplication {

	public static void main(String[] args) {
		SpringApplication.run(ApiRestCustomerApplication.class, args);
	}

}
