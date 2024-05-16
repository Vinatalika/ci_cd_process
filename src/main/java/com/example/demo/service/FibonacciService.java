package com.example.demo.service;


import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class FibonacciService {
    public List<Integer> generateFibonacciNumbers(int n) {
        List<Integer> fibonacciNumbers = new ArrayList<>();
        if (n <= 0) {
            return fibonacciNumbers;
        }
        fibonacciNumbers.add(0);

        if (n == 1) {
            return fibonacciNumbers;
        }
        fibonacciNumbers.add(1);

        for (int i=2; i<n; i++){
            int nextNumber = fibonacciNumbers.get(i - 1) + fibonacciNumbers.get(i - 2);
            fibonacciNumbers.add(nextNumber);
        }
        return fibonacciNumbers;

    }
}
