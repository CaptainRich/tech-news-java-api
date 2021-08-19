package com.technews.repository;


import com.technews.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface UserRepository extends JpaRepository<User, Integer> {
    // Create the interface to find a user by their email
    User findUserByEmail(String email) throws Exception;
}
