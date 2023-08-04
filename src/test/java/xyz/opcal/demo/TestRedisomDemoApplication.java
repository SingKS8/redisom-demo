package xyz.opcal.demo;

import org.springframework.boot.SpringApplication;

public class TestRedisomDemoApplication {

	public static void main(String[] args) {
		SpringApplication.from(RedisomDemoApplication::main).with(RedisContainersConfiguration.class).run(args);
	}

}
