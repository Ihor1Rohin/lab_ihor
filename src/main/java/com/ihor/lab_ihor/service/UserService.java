package com.ihor.lab_ihor.service;

import com.ihor.lab_ihor.model.UserProfile;
import com.ihor.lab_ihor.repository.UserProfileRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    private final UserProfileRepository userRepository;

    public UserService(UserProfileRepository userRepository) {
        this.userRepository = userRepository;
    }

    public List<UserProfile> getAllUsers() {
        return userRepository.findAll();
    }

    public UserProfile getUserById(Integer id) {
        return userRepository.findById(id).orElse(null);
    }
}