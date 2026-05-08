package com.tax;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class TaxCalculatorTest {

    TaxCalculator calculator = new TaxCalculator();

    @Test
    public void testIncomeBelow250000() {
        assertEquals(0, calculator.calculateTax(200000));
    }

    @Test
    public void testIncomeBetween250000And500000() {
        assertEquals(20000, calculator.calculateTax(400000));
    }

    @Test
    public void testIncomeBetween500000And1000000() {
        assertEquals(140000, calculator.calculateTax(700000));
    }

    @Test
    public void testIncomeAbove1000000() {
        assertEquals(450000, calculator.calculateTax(1500000));
    }
}