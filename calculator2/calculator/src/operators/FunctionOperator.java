package com.jtest.calculator2.calculator.src.operators;



/**
 * Created by jayeshs on 8/18/16.
 * All functional operations should extend this class, like logarithmic, power, sqrt, sin, cos etc..
 */
public abstract class FunctionOperator implements Operator {


    public abstract Integer evaluate() throws Exception;
}
