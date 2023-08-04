package xyz.opcal.demo;

import org.springframework.boot.test.context.TestConfiguration;
import org.springframework.boot.testcontainers.service.connection.ServiceConnection;
import org.springframework.context.annotation.Bean;

import com.redis.testcontainers.RedisStackContainer;

@TestConfiguration(proxyBeanMethods = false)
public class RedisContainersConfiguration {

	@Bean
	@ServiceConnection(name = "redis")
	public RedisStackContainer redisContainer() {
		return new RedisStackContainer(RedisStackContainer.DEFAULT_IMAGE_NAME.withTag(RedisStackContainer.DEFAULT_TAG));
	}

}
