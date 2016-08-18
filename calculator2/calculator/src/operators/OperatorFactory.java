package com.jtest.calculator2.calculator.src.operators;

/**
 * Created by jayeshs on 8/18/16.
 */
public class OperatorFactory {

    public static Operator createOperatorInstance(String operator, Operator leftVal, Operator rightVal) {
        if (operator.contains("+")) {
            return new AddOperator(leftVal, rightVal);
        } else if (operator.contains("*")) {
            return new MulOperator(leftVal, rightVal);
        }
        else if (operator.contains("-")) {
            return new SubOperator(leftVal, rightVal);
        }
        else if (operator.contains("/")) {
            return new DivOperator(leftVal, rightVal);
        }
        else {
            throw new IllegalArgumentException("found invalid operator");
        }
    }
}
