package com.jtest.calculator2.calculator.src.parsers;

/**
 * Created by jayeshs on 8/18/16.
 */
public abstract class Parser {

    static final String basicOperators = "+-/*";
    static final String priority_1 = "+-"; static final int PRIORITY_1 = 100;
    static final String priority_2 = "/*"; static final int PRIORITY_2 = 200;


    String expr;
    int current = 0;

    public Parser(String expr) {
        this.expr = expr;
    }


    public abstract String getToken();

    protected boolean isOperator(char c) {
        return basicOperators.indexOf(c) != -1;
    }

    public static boolean isOperator(String s)
    {
        return s.length() == 1 && basicOperators.contains(s);
    }

    public static int getOperatorPriority(String op)
    {
        if (!isOperator(op)) throw new IllegalArgumentException();

        if (priority_1.contains(op)) return PRIORITY_1;
        if (priority_2.contains(op)) return PRIORITY_2;

        return 0;
    }

    public static boolean isNumber(String s)
    {
        try
        {
            Integer.parseInt(s);
            return true;
        }
        catch (NumberFormatException e)
        {
            return false;
        }
    }
}
