package com.kamathad.Mockito5xExperiments;

import org.springframework.stereotype.Repository;

@Repository
public class UserRepositoryImpl implements UserRepository{
    @Override
    public User findById(Long id) {
        return new User("Lalle");
    }
}