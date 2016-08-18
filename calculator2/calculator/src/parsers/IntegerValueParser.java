package com.jtest.calculator2.calculator.src.parsers;

/**
 * Created by jayeshs on 8/18/16.
 */
public class IntegerValueParser extends Parser {

    public IntegerValueParser(String expression) {
        super(expression);
    }

    @Override
    public String getToken() {
        StringBuilder stringBuilder = new StringBuilder();
        if (current == expr.length()) return null;
        char c = expr.charAt(current);
        if (isOperator(c)) {
            current++;
            stringBuilder.append(c);
        }
        else if (Character.isDigit(c)) {
            while (current < expr.length() && Character.isDigit(c)) {
                stringBuilder.append(c);
                current++;
                if (current < expr.length()) {
                    c = expr.charAt(current);
                }
            }
        }
        else {
            stringBuilder.append(c);
            current++;
        }

        return stringBuilder.toString();

    }
}
