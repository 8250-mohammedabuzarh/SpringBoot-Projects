package com.example3.userfilter.repository;

import com.example3.userfilter.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.ArrayList;
import java.util.List;

public interface UserRepository extends JpaRepository<User, Long> {
    @Query("SELECT u FROM User u WHERE u.age = :age AND u.city = :city")
    List<User> findByAgeAndCity(@Param("age") int age, @Param("city") String city);
}

