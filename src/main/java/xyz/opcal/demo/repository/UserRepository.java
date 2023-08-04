package xyz.opcal.demo.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import xyz.opcal.demo.domain.User;

@Repository
public interface UserRepository extends CrudRepository<User, Long> {

	List<User> findByFirstNameAndLastName(String firstName, String lastName);
}
