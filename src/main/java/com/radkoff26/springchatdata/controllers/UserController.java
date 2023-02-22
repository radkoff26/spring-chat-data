package com.radkoff26.springchatdata.controllers;

import java.sql.Timestamp;
import java.util.Collections;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.radkoff26.springchatdata.domain.dto.UserInsertionBody;
import com.radkoff26.springchatdata.domain.entity.User;
import com.radkoff26.springchatdata.services.declaration.UserService;

@RestController
@RequestMapping("/user")
public class UserController {
    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @PostMapping
    public ResponseEntity<User> postUser(@RequestBody UserInsertionBody body) {
        User user = userService.saveUser(new User(
                0,
                body.login(),
                body.password(),
                body.email(),
                body.firstName(),
                body.lastName(),
                null,
                body.avatarSlug(),
                false,
                null,
                new Timestamp(System.currentTimeMillis()),
                Collections.emptyList()
        ));
        return ResponseEntity.ok(user);
    }
}
