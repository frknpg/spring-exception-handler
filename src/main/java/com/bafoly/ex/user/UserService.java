package com.bafoly.ex.user;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class UserService {

    private final UserRepository userRepository;

    public User getUserById(long id) {
        return userRepository.findById(id).get();
    }
}
