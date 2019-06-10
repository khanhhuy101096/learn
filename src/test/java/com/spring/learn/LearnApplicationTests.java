package com.spring.learn;

import com.spring.learn.service.EmailService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class LearnApplicationTests {

    @Autowired
    private EmailService emailService;

    @Test
    public void contextLoads() {
    }

    @Test
    public void testEmail(){
        emailService.sendEmail("evoletah101096@gmail.com", "Test subject", "Test mail");
    }

}
