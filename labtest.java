package org.test_example;

import org.example.MaxInteger;
import org.junit.jupiter.api.*;

import java.io.FileNotFoundException;

import static org.junit.jupiter.api.Assertions.*;

public class MaxIntegerTest {
    static int[] numbers;
    @BeforeAll
    static void beforeAll() throws FileNotFoundException {
        numbers = MaxInteger.readNumbers("/Users/mirzakrupic/Desktop/numbers.txt");
    }

    @AfterAll
    static void afterAll() {
        numbers = null;
    }
    @Test
    public void testFindsCorretMaximum() {
        int maxNumber = MaxInteger.findMax(numbers);
        assertEquals(987, maxNumber);
    }

    @Test
    public void testDoesNotFindCorrectMaxim() {
        int maxNumber = MaxInteger.findMax(numbers);
        assertNotEquals(42, maxNumber);
    }
}
