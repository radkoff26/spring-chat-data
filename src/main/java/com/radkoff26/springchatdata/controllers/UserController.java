package com.radkoff26.springchatdata.controllers;

import java.sql.Timestamp;
import java.util.Collections;
import java.util.logging.Logger;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.radkoff26.springchatdata.domain.dto.UserEmailSubmissionBody;
import com.radkoff26.springchatdata.domain.dto.UserRequestBody;
import com.radkoff26.springchatdata.domain.entity.User;
import com.radkoff26.springchatdata.services.declaration.UserService;

@RestController
@RequestMapping("/user")
public class UserController {
    private static final Logger LOGGER = Logger.getLogger(UserController.class.getName());
    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping
    public ResponseEntity<User> getUserByLogin(@RequestParam("login") String login) {
        User user = userService.getUserByLogin(login);
        if (user == null) {
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok(user);
    }

    @GetMapping("/{id}")
    public ResponseEntity<User> getUserById(@PathVariable("id") long id) {
        User user = userService.getUserById(id);
        if (user == null) {
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok(user);
    }

    @PostMapping
    public ResponseEntity<User> postUser(@RequestBody UserRequestBody body) {
        // Mock now TODO
        User user = userService.saveUser(new User(
                0,
                body.login(),
                body.password(),
                body.email(),
                false,
                "body.firstName()",
                "body.lastName()",
                null,
                "body.avatarSlug()",
                false,
                null,
                new Timestamp(System.currentTimeMillis()),
                Collections.emptyList()
        ));
        return ResponseEntity.ok(user);
    }

    @PostMapping("/submitEmail")
    public ResponseEntity<Void> submitUserEmail(@RequestBody UserEmailSubmissionBody body) {
        User user = userService.getUserById(body.id());
        user.setEmailVerified(true);
        userService.saveUser(user);
        return ResponseEntity.ok().build();
    }
}
