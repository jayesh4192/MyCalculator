package com.jtest.calculator2.calculator.src.operators;

/**
 * Created by jayeshs on 8/18/16.
 */
public class SubOperator extends BinaryOperator<Integer> {

    public SubOperator(Operator leftVal, Operator rightVal) {
       super(leftVal, rightVal);
    }

    @Override
    public Integer evaluate() throws Exception {
        if (leftVal == null) {
            return rightVal.evaluate();
        }
        return leftVal.evaluate() - rightVal.evaluate();
    }
}
