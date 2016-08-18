package com.jtest.calculator2.calculator.src.operators;

/**
 * Created by jayeshs on 8/18/16.
 */
@SuppressWarnings("serial")
public class DivideByZeroException extends Exception {
     public DivideByZeroException() {
         super("Divide by zero");
     }

    public DivideByZeroException(String message) {
        super("Divide by zero " + message);
    }
}
