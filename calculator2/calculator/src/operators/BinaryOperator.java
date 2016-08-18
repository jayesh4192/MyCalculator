package com.jtest.calculator2.calculator.src.operators;


/**
 * Created by jayeshs on 8/18/16.
 */
public abstract class BinaryOperator<X> implements Operator {
    Operator leftVal;
    Operator rightVal;
    public BinaryOperator(Operator leftVal, Operator rightVal) {
        this.leftVal = leftVal;
        this.rightVal = rightVal;
    }

    public abstract Integer evaluate() throws Exception;

}
