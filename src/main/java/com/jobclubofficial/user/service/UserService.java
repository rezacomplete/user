package com.jobclubofficial.user.service;

import com.jobclubofficial.user.entity.Education;
import com.jobclubofficial.user.entity.Post;
import com.jobclubofficial.user.entity.User;
import com.jobclubofficial.user.exception.InvalidDataException;
import com.jobclubofficial.user.repository.UserRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import javax.transaction.Transactional;
import java.util.Optional;


@Service
@Transactional
@Slf4j
public class UserService {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private RestTemplate restTemplate;

    @Value("${url.post}")
    private String postUrl;

    @Value("${url.education}")
    private String educationUrl;

    public User getUser(String username) {
        User user =  goGetUser(username.toLowerCase());


        Education education = getEducationForUser(user.getUsername());

        Post post = getPostForUser(user.getUsername());

        user.setSchool(education.getSchool());
        user.setDegree(education.getDegree());
        user.setPostMessage(post.getPostMessage());

        return user;
    }

    private Post getPostForUser(String username) {
        log.info("Calling post endpoint");
        return restTemplate.getForObject(postUrl + "/users/" + username + "/post", Post.class);
    }

    private Education getEducationForUser(String username) {
        log.info("Calling education endpoint");
        return restTemplate.getForObject(educationUrl + "/users/" + username + "/education", Education.class);
    }

    private User goGetUser(String username) {
        Optional<User> userOptional = userRepository.findUserByUsername(username.toLowerCase());
        if (userOptional.isEmpty()) {
            throw new InvalidDataException("User does not exist");
        }

        return userOptional.get();
    }
}
