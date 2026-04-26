package com.ihor.lab_ihor.repository;

import com.ihor.lab_ihor.model.UserProfile;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserProfileRepository extends JpaRepository<UserProfile, Integer> {
}