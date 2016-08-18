package com.jtest.calculator2.calculator.src.parsers;

/**
 * Created by jayeshs on 8/18/16.
 */
@SuppressWarnings("serial")
public class ExpressionParsingException extends Exception {
     public ExpressionParsingException() {
         super("Expression parsing error");
     }

    public ExpressionParsingException(String message) {
        super("Expression parsing error " + message);
    }
}
