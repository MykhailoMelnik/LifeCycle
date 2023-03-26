package com.lifecycle.service;

import com.lifecycle.InitFacts;
import com.lifecycle.model.User;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class UserServiceImpl implements UserService {

    @Override
    public List<String> getUserFact(User user) {
        InitFacts initFacts = new InitFacts(user.getDataOfBirth());
        user.setFacts(initFacts.run());
        return user.getFacts();
    }
}
