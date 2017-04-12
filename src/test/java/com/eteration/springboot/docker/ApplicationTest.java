package com.eteration.springboot.docker;


import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.SpringBootTest.WebEnvironment;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.test.context.junit4.SpringRunner;

import com.eteration.springboot.docker.Application;

@RunWith(SpringRunner.class)
@SpringBootTest(classes=Application.class,webEnvironment=WebEnvironment.RANDOM_PORT)
public class ApplicationTest {
    
    @Autowired
    private TestRestTemplate restTemplate;

    @Test
    public void test() {
        ResponseEntity<String> response = this.restTemplate.getForEntity(
            "/", String.class);
        Assert.assertEquals(response.getStatusCode(),HttpStatus.OK);
        Assert.assertEquals(response.getBody(),"Hello Docker");
    }
    
    
    @Test
    public void testFail() {
        ResponseEntity<String> response = this.restTemplate.getForEntity(
            "/", String.class);
        Assert.assertEquals(response.getStatusCode(),HttpStatus.OK);
        Assert.assertEquals(response.getBody(),"HelloDocker");
    }

}