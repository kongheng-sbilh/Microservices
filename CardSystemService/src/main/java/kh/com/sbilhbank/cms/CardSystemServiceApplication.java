package kh.com.sbilhbank.cms;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class CardSystemServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(CardSystemServiceApplication.class, args);
	}

}
