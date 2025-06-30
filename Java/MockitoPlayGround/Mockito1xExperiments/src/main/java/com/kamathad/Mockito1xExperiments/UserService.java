package com.kamathad.Mockito1xExperiments;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public String getUserName(Long id){
        User user = userRepository.findById(id);
        System.out.println("User -> "+user.toString());
        return user!=null ? user.getName() : null;
    }
}
