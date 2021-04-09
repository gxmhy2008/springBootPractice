package com.practice.springboot.practice;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;

@SpringBootTest
class PracticeApplicationTests {

    @Autowired
    private Person person;

    @Autowired
    private ApplicationContext applicationContext;

    @Test
    public void testBean() {
        System.out.println(applicationContext.containsBean("helloSer"));
    }

    @Test
    public void testYAML() {
        System.out.println(person);
    }
}
