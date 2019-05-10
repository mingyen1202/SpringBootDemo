package com.chtti.demo.DemoHelloWorld;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.boot.web.server.LocalServerPort;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.test.context.junit4.SpringRunner;

import java.net.MalformedURLException;
import java.net.URL;

import static org.junit.Assert.*;

@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class RestTestCase {
    TestRestTemplate restTemplate;
    URL base;
    @LocalServerPort
    int port;

    @Before
    public void setUp() throws MalformedURLException {
        base = new URL("http://localhost:" + port);
    }

    @Test
    public void testRoot() {
        restTemplate = new TestRestTemplate();
        ResponseEntity<String> res = restTemplate.getForEntity(base.toString(), String.class);
        assertEquals(HttpStatus.OK, res.getStatusCode());
        assertTrue(res.getBody().contains("boot"));
    }

    @Test
    public void testEP5() {
        restTemplate = new TestRestTemplate();
        ResponseEntity<String> res = restTemplate.getForEntity(base.toString() + "ep5", String.class);
        assertEquals(HttpStatus.NOT_FOUND, res.getStatusCode());
    }

    @Test
    public void testEP3() {
        restTemplate = new TestRestTemplate();
        ResponseEntity<Lesson> res = restTemplate.getForEntity(base.toString() + "ep3", Lesson.class);
        assertEquals(HttpStatus.OK, res.getStatusCode());
        Lesson lesson = res.getBody();
        assertTrue(lesson.getInstructor().equals("MarkHo"));
        assertEquals(lesson.getDuration(), 28);
    }
}
