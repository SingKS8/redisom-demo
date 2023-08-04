package xyz.opcal.demo.service;

import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.DynamicPropertyRegistry;
import org.springframework.test.context.DynamicPropertySource;
import org.testcontainers.lifecycle.Startables;

import com.redis.testcontainers.RedisStackContainer;

import xyz.opcal.demo.domain.User;

@SpringBootTest
@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
class UserServiceTest {

//	static RedisStackContainer redisStackContainer = new RedisStackContainer(RedisStackContainer.DEFAULT_IMAGE_NAME.withTag(RedisStackContainer.DEFAULT_TAG));
//
//	@DynamicPropertySource
//	static void updateRedis(DynamicPropertyRegistry registry) {
//		Startables.deepStart(redisStackContainer).join();
//
//		registry.add("spring.data.redis.host", redisStackContainer::getHost);
//		registry.add("spring.data.redis.port", redisStackContainer::getFirstMappedPort);
//	}
	
	
	@Autowired
	UserService userService;

	@Test
	@Order(0)
	void save() {
		User user = new User();
		var t = System.currentTimeMillis();
		user.setFirstName("TF" + t);
		user.setLastName("TL" + t);
		user.setEmail("TF" + t + "@excemple.com");
		System.out.println(userService.save(user));
	}

	@Test
	@Order(1)
	void all() {
		userService.all().forEach(System.out::println);
	}

}
