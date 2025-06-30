package com.kamathad.Mockito5xExperiments;



import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.util.ReflectionTestUtils;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.when;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = AppConfig.class)
public class UserServiceTest {

    @Autowired
    private UserService userService;

    @Mock
    private UserRepository userRepository;

    @Before
    public void setup(){
        MockitoAnnotations.openMocks(this);
        ReflectionTestUtils.setField(userService, "userRepository", userRepository);
    }

    @Test
    public void testGetUserName() {
        when(userRepository.findById(1L)).thenReturn(new User("Lalle"));
        String name = userService.getUserName(1L);
        assertEquals("Lalle", name);
    }

}