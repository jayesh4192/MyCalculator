package com.jtest.calculator2.calculator.src.operators;

/**
 * Created by jayeshs on 8/18/16.
 */
public class AddOperator extends BinaryOperator {
    public AddOperator(Operator leftVal, Operator rightVal) {
        super(leftVal, rightVal);
    }

    @Override
    public Integer evaluate() throws Exception{
        if (leftVal == null) {
            return rightVal.evaluate();
        }
        return leftVal.evaluate() + rightVal.evaluate();
    }
}
