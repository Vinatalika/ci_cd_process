package com.example.demo.fibonacci.service;

import com.example.demo.service.FibonacciService;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class FibonacciServiceTest {
    private final FibonacciService fibonacciService = new FibonacciService();

    @Test
    public void testGenerateFibonacciNumbers() {
        List<Integer> result = fibonacciService.generateFibonacciNumbers(10);
        List<Integer> expected = Arrays.asList(0, 1, 1, 2, 3, 5, 8, 13, 21, 34);

        assertEquals(expected, result, "The Fibonacci sequence for n=10 should be correct");
    }
    @Test
    public void testGenerateFibonacciNumbersForZero() {
        List<Integer> result = fibonacciService.generateFibonacciNumbers(0);
        assertTrue(result.isEmpty(), "The Fibonacci sequence for n=0 should be empty");
    }

    @Test
    public void testGenerateFibonacciNumbersForOne() {
        List<Integer> result = fibonacciService.generateFibonacciNumbers(1);
        List<Integer> expected = Arrays.asList(0);

        assertEquals(expected, result, "The Fibonacci sequence for n=1 should be [0]");
    }

    @Test
    public void testGenerateFibonacciNumbersForNegative() {
        List<Integer> result = fibonacciService.generateFibonacciNumbers(-5);
        assertTrue(result.isEmpty(), "The Fibonacci sequence for negative n should be empty");
    }
}

