package com.radkoff26.springchatdata.services.declaration;

import com.radkoff26.springchatdata.domain.entity.User;

public interface UserService {
    User saveUser(User user);
    User getUserByLogin(String login);
    User getUserById(long id);
}
