package com.bafoly.ex.user;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class UserService {

    private final UserRepository userRepository;

    public User getUserById(long id) {
        return userRepository.findById(id).get();
    }
}
