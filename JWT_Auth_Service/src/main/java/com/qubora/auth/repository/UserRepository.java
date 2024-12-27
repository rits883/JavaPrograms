package com.qubora.auth.repository;

import com.qubora.auth.entity.User;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.Optional;

public interface UserRepository extends MongoRepository<User,String> {
      Optional<User> findByUserName(String userName);
}
