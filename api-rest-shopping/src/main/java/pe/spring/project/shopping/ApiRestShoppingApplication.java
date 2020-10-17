package pe.spring.project.shopping;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;
import org.springframework.cloud.openfeign.EnableFeignClients;

@EnableHystrixDashboard
@EnableHystrix
@EnableEurekaClient
@SpringBootApplication
@EnableFeignClients
public class ApiRestShoppingApplication {

	public static void main(String[] args) {
		SpringApplication.run(ApiRestShoppingApplication.class, args);
	}

}
