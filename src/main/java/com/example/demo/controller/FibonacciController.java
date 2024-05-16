package com.example.demo.controller;

import com.example.demo.service.FibonacciService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/fibonacci")
public class FibonacciController {
    @Autowired
    private FibonacciService fibonacciService;
    @GetMapping ("/{n}")
    public List<Integer> getFibonacciNumbers(@PathVariable int n){
        return fibonacciService.generateFibonacciNumbers(n);
    }
}
