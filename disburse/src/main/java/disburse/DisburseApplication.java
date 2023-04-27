package disburse;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import config.DisburseConfig;

public class DisburseApplication {

	public static void main(String[] args) {
		SpringApplication.run(DisburseConfig.class, args);
	}

}
