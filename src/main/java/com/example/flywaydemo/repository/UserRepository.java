package com.example.flywaydemo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.flywaydemo.domain.User;

/**
 * Created by rajeevkumarsingh on 20/08/17.
 */
@Repository
public interface UserRepository extends JpaRepository<User, Long> {
}
