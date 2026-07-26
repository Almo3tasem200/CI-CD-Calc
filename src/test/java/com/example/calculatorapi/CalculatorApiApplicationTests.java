package com.example.calculatorapi;

import com.example.calculatorapi.service.CalculatorService;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
class CalculatorServiceTest {

    CalculatorService service = new CalculatorService();

    @Test
    void add() {
        assertEquals(7, service.add(5,2));
    }

    @Test
    void subtract() {
        assertEquals(3, service.subtract(5,2));
    }

    @Test
    void multiply() {
        assertEquals(10, service.multiply(5,2));
    }

    @Test
    void divide() {
        assertEquals(5, service.divide(10,2));
    }
}
