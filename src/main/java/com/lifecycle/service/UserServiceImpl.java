package com.lifecycle.service;

import com.lifecycle.model.InitFacts;
import com.lifecycle.model.User;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    @Override
    public String getUserRandomFact(User user) {
        InitFacts initFacts = new InitFacts(user.getDataOfBirth());
        user.setFacts(initFacts.run());
        return user.getFacts().get(0);
    }
}
