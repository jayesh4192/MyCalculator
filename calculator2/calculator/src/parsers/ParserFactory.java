package com.jtest.calculator2.calculator.src.parsers;

/**
 * Created by jayeshs on 8/18/16.
 */
public class ParserFactory {

    public static Parser createParserInstance(String expression) {
        if (expression.contains(".")) { // if it contains decimal values
           return new RealValueParser(expression);
        }
        else {
            return new IntegerValueParser(expression);
        }
    }
}
