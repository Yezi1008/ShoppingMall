package com.zon.service;

import com.zone.model.User;

public interface UserService {

    User findByUsername(String username);
}
