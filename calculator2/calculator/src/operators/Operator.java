package com.jtest.calculator2.calculator.src.operators;

/**
 * Created by jayeshs on 8/18/16.
 */
public interface Operator<X extends Number> {
     public Integer evaluate() throws Exception;
}
