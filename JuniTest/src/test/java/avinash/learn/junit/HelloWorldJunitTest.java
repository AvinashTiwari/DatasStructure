package avinash.learn.junit;

import org.junit.Test;

import static org.junit.Assert.*;

public class HelloWorldJunitTest {

    HelloWorldJunit helloworld = new HelloWorldJunit();

    @Test
    public void hello() {
        assertEquals("Hello world", helloworld.hello());
    }
}