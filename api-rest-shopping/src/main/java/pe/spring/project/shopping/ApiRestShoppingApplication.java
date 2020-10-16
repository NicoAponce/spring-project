package pe.spring.project.shopping;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@SpringBootApplication
public class ApiRestShoppingApplication {

	public static void main(String[] args) {
		SpringApplication.run(ApiRestShoppingApplication.class, args);
	}

}
