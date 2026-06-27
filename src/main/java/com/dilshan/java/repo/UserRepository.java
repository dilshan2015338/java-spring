package com.dilshan.java.repo;

import com.dilshan.java.modal.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
    // You can define custom query methods here if needed
    Optional<User> findByFirstName(String firstName);
    List<User> findByAgeGreaterThan(Integer age);

    //One to One relationship example
    //One to Many and Many to One relationship example
    //Many to Many relationship example
}
