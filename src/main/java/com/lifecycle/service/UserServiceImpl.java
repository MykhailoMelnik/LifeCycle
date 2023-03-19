package com.lifecycle.service;

import com.lifecycle.model.InitFacts;
import com.lifecycle.model.User;
import org.springframework.stereotype.Service;

import java.util.Collections;


@Service
public class UserServiceImpl implements UserService {

    @Override
    public String getUserRandomFact(User user) {
        InitFacts initFacts = new InitFacts(user.getDataOfBirth());
        user.setFacts(initFacts.run());
        Collections.shuffle(user.getFacts());
        return user.getFacts().get(0);
    }
}
