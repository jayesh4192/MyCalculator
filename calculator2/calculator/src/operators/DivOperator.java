package com.jtest.calculator2.calculator.src.operators;

/**
 * Created by jayeshs on 8/18/16.
 */
public class DivOperator extends BinaryOperator {
    public DivOperator(Operator leftVal, Operator rightVal) {
        super(leftVal, rightVal);
    }

    public Integer evaluate() throws Exception{
        if (leftVal == null) {
            return rightVal.evaluate();
        }
        if (rightVal.evaluate() == 0) throw new Exception("Divide by 0");
        return leftVal.evaluate() / rightVal.evaluate();
    }
}
