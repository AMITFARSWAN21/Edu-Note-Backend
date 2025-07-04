package com.authify.repository;

import com.authify.entity.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface UserRepository extends JpaRepository<UserEntity,Long> {
    Optional<UserEntity> findByEmail(String email);

    List<UserEntity> findByRole(long role);

    Boolean existsByEmail(String email);




}
