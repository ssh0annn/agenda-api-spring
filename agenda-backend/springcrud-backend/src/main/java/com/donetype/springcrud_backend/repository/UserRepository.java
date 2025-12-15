package com.donetype.springcrud_backend.repository;

import com.donetype.springcrud_backend.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User,Long> {
}
