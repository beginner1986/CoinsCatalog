package pl.beginner;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories
public class CoinsCatalogApplication {

	public static void main(String[] args) {
		SpringApplication.run(CoinsCatalogApplication.class, args);
	}

}
