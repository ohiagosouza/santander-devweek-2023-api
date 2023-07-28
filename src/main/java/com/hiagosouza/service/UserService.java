package com.hiagosouza.service;

import com.hiagosouza.domain.model.User;

public interface UserService {
    User findById(long id);

    User create(User userToCreate);

}
