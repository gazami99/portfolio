package com.example.demo.entity;

import com.example.demo.exception.UserNotFoundException;
import com.example.demo.repository.UserRepository;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.web.servlet.View;

import java.util.Optional;

import static org.junit.jupiter.api.Assertions.assertEquals;

@AutoConfigureTestDatabase(replace = AutoConfigureTestDatabase.Replace.NONE)
@DataJpaTest
class UsersTest {

    @Autowired
    UserRepository userRepository;

    @Test
    public void findByUserName() {

        String UsernameTest1 = "gazami";
        String UsernameTest2 = "Amie"; // no in table


        assertEquals(true,userRepository.findByUserName(UsernameTest1).isPresent());
        assertEquals(false,userRepository.findByUserName(UsernameTest2).isPresent());

    }

}