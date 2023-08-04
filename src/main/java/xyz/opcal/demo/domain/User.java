package xyz.opcal.demo.domain;

import java.util.Date;

import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.redis.core.RedisHash;
import org.springframework.data.redis.core.index.Indexed;

import com.redis.om.spring.annotations.Bloom;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;

@Data
@NoArgsConstructor
@RedisHash
public class User {

	@Id
	private Long id;

	@Indexed
	@NonNull
	private String firstName;

	@Indexed
	private String middleName;

	@Indexed
	@NonNull
	private String lastName;

	@NonNull
	@Indexed
	@Bloom(name = "bf_user_email", capacity = 100000, errorRate = 0.001)
	String email;

	@CreatedDate
	private Date createdDate;

	@LastModifiedDate
	private Date lastModifiedDate;
}
