package pe.spring.project.product;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@SpringBootApplication
public class ApiRestProductApplication {

	public static void main(String[] args) {
		SpringApplication.run(ApiRestProductApplication.class, args);
	}

}
