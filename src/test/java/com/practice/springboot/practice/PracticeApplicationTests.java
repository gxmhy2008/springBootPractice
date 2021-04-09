package com.practice.springboot.practice;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class PracticeApplicationTests {

    @Autowired
    private Person person;

    @Test
    public void testYAML() {
        System.out.println(person);
    }
}
