package dev.ericcampos.newhorizons;

import org.springframework.boot.SpringApplication;

public class TestNewHorizonsApiApplication {

	public static void main(String[] args) {
		SpringApplication.from(NewHorizonsApiApplication::main).with(TestcontainersConfiguration.class).run(args);
	}

}
