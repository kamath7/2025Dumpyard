package com.kamathad.Mockito1xExperiments;

import org.springframework.stereotype.Repository;

@Repository
public class UserRepostoryImpl implements UserRepository{
    @Override
    public User findById(Long id) {
        return new User("Lalle");
    }
}
