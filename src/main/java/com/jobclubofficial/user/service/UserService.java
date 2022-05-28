package com.jobclubofficial.user.service;

import com.jobclubofficial.user.entity.User;
import com.jobclubofficial.user.exception.InvalidDataException;
import com.jobclubofficial.user.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.Optional;


@Service
@Transactional
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public User getUser(String username) {
        return goGetUser(username.toLowerCase());
    }

    private User goGetUser(String username) {
        Optional<User> userOptional = userRepository.findUserByUsername(username.toLowerCase());
        if (userOptional.isEmpty()) {
            throw new InvalidDataException("User does not exist");
        }

        return userOptional.get();
    }
}
