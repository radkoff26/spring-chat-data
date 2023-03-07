package com.radkoff26.springchatdata.services.implementation;

import java.sql.Timestamp;
import java.util.Collections;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.radkoff26.springchatdata.domain.entity.User;
import com.radkoff26.springchatdata.repositories.UserRepository;
import com.radkoff26.springchatdata.services.declaration.UserService;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class UserServiceImplTest {
    private final UserService userService;
    private final UserRepository userRepository;

    @Autowired
    UserServiceImplTest(UserService userService, UserRepository userRepository) {
        this.userService = userService;
        this.userRepository = userRepository;
    }

    @Test
    void saveUser() {
        User user = new User(
                0,
                "login",
                "password",
                "email",
                false,
                "firstName",
                "lastName",
                null,
                null,
                false,
                null,
                new Timestamp(System.currentTimeMillis()),
                Collections.emptyList()
        );
        user = userService.saveUser(user);
        assertEquals(1, user.getId());
        User received = userRepository.findById(1L).orElse(null);
        assertEquals(user, received);
        userRepository.delete(user);
        received = userRepository.findById(1L).orElse(null);
        assertNull(received);
    }
}