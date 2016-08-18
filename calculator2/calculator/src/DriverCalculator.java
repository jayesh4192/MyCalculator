package com.jtest.calculator2.calculator.src;

/**
 * Created by jayeshs on 8/18/16.
 */
public class DriverCalculator {

    public static void main(String[] args) {
        try {
            CalculatorImpl calculator = new CalculatorImpl();
            System.out.println(calculator.calculate("1+2*4-5"));
        } catch (Exception ee) {
            System.out.println(ee.getMessage());
        }
    }
}
