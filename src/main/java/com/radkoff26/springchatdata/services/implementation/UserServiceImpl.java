package com.radkoff26.springchatdata.services.implementation;

import org.springframework.stereotype.Service;

import com.radkoff26.springchatdata.domain.entity.User;
import com.radkoff26.springchatdata.repositories.UserRepository;
import com.radkoff26.springchatdata.services.declaration.UserService;

@Service
public class UserServiceImpl implements UserService {
    private final UserRepository userRepository;

    public UserServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public User saveUser(User user) {
        return userRepository.save(user);
    }

    @Override
    public User getUserByLogin(String login) {
        return userRepository.findUserByLogin(login);
    }

    @Override
    public User getUserById(long id) {
        return userRepository.findById(id).orElse(null);
    }
}
