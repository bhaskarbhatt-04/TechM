package com.example;

import org.junit.Test;
import static org.junit.Assert.*;

public class AppTest {

    @Test
    public void testDivide() {
        App app = new App();
        assertEquals(5, app.divide(10, 2)); // Test division of 10 by 2
        assertEquals(2, app.divide(8, 4));  // Test division of 8 by 4
    }

    @Test(expected = IllegalArgumentException.class)
    public void testDivideByZero() {
        App app = new App();
        app.divide(10, 0); // This should throw IllegalArgumentException
    }
}

