package com.project.lodgemoney.repository;

import com.project.lodgemoney.domain.User;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.*;

@RunWith(SpringRunner.class)
@SpringBootTest
public class UserRepositoryTest {

    @Autowired
    UserRepository userRepository;

    @Test
    public void name() throws Exception {
        assertEquals("hello", "hello");
    }

    @Test
    public void save() throws Exception {
        User user = new User("nekisse", "nekisse", "lee");
        userRepository.save(user);

        userRepository.delete(user.getId());
    }
}