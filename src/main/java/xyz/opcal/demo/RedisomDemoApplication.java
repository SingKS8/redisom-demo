package xyz.opcal.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.redis.om.spring.annotations.EnableRedisEnhancedRepositories;

@EnableRedisEnhancedRepositories(basePackages = {"xyz.opcal.demo.repository"})
@SpringBootApplication
public class RedisomDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(RedisomDemoApplication.class, args);
	}

}
