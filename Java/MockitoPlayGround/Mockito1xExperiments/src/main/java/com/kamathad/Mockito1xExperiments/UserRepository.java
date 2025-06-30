package com.kamathad.Mockito1xExperiments;

import org.springframework.stereotype.Repository;

public interface UserRepository {
    User findById(Long id);
}
