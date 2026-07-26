package com.example.calculatorapi.controller;

import com.example.calculatorapi.service.CalculatorService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController("/calc")
public class CalculatorController {

    private final CalculatorService service;

    public CalculatorController(CalculatorService service) {
        this.service = service;
    }

    // /add?a=5&b=2
    @GetMapping("/add")
    public double add(double a, double b) {
        return service.add(a, b);
    }

    // /subtract?a=8&b=2
    @GetMapping("/subtract")
    public double subtract(double a, double b) {
        return service.subtract(a, b);
    }

    // /multiply?a=5&b=5
    @GetMapping("/multiply")
    public double multiply(double a, double b) {
        return service.multiply(a, b);
    }

    // /divide?a=10&b=2
    @GetMapping("/divide")
    public double divide(float a, float b) {
        return service.divide(a, b);
    }
}
