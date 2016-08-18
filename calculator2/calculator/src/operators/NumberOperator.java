package com.jtest.calculator2.calculator.src.operators;

/**
 * Created by jayeshs on 8/18/16.
 */
public class NumberOperator implements Operator {
    Integer val;

    public NumberOperator(Integer val) {
        this.val = val;
    }

    public NumberOperator(String valStr) {
        this(Integer.parseInt(valStr));
    }

    @Override
    public Integer evaluate() {
        return val;
    }
}
