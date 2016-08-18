package com.jtest.calculator2.calculator.src.operators;

/**
 * Created by jayeshs on 8/18/16.
 */
public class MulOperator extends BinaryOperator<Integer> {

    public MulOperator(Operator leftVal, Operator rightVal) {
       super(leftVal, rightVal);
    }

    public Integer evaluate() throws Exception {
        if (leftVal == null) {
            return rightVal.evaluate();
        }
        return leftVal.evaluate() * rightVal.evaluate();
    }
}
