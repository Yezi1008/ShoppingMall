package com.zone.serviceprovider;

import com.zon.service.UserService;
import com.zone.dao.UserDao;
import com.zone.model.User;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    private final UserDao dao;

    public UserServiceImpl(UserDao dao) {
        this.dao = dao;
    }

    @Override
    public User findByUsername(String username) {
        return dao.findByUsername(username);
    }
}
