package com.jtest.calculator2.calculator.src;

import com.jtest.calculator2.calculator.src.operators.NumberOperator;
import com.jtest.calculator2.calculator.src.operators.Operator;
import com.jtest.calculator2.calculator.src.operators.OperatorFactory;
import com.jtest.calculator2.calculator.src.parsers.ExpressionParsingException;
import com.jtest.calculator2.calculator.src.parsers.Parser;
import com.jtest.calculator2.calculator.src.parsers.ParserFactory;

import java.util.Stack;

/**
 * Created by jayeshs on 8/18/16.
 */
public class CalculatorImpl implements Calculator {

    @Override
    public String calculate(String expression) throws Exception {

        String expr = "";
        try {
            expr = convertToReversePolishNotation(expression);
        } catch (ExpressionParsingException ee) {
            throw ee;
        }

        Stack<Operator> stack = new Stack<>();
        String[] tokens = expr.split(" ");
        for (String token : tokens) {
             if (Parser.isOperator(token)) {
                 Operator rightVal = stack.pop();
                 Operator leftVal = stack.isEmpty() ? null : stack.pop();
                 Operator operator = OperatorFactory.createOperatorInstance(token, leftVal, rightVal);
                 Integer result = operator.evaluate();
                 stack.push(new NumberOperator(result));
             }
             else {
                 stack.push(new NumberOperator(token));
             }
        }
        return stack.pop().evaluate().toString();
    }


    private static String convertToReversePolishNotation(String expression) throws ExpressionParsingException
    {
        Parser parser = ParserFactory.createParserInstance(expression);

        StringBuilder stringBuilder = new StringBuilder();
        Stack<String> stack = new Stack<String>();

        String str;
        while ((str = parser.getToken()) != null)
        {
            if (Parser.isNumber(str))
            {
                stringBuilder.append(str).append(" ");
            } else if (Parser.isOperator(str))
            {
                while (!stack.isEmpty())
                {
                    String operator = stack.peek();
                    if (Parser.isOperator(operator) && Parser.getOperatorPriority(str) <= Parser.getOperatorPriority(operator))
                        stringBuilder.append(stack.pop()).append(" ");
                    else
                        break;
                }

                stack.push(str);
            }
            else // anything else treat it as incorrect.
            {
                throw new ExpressionParsingException("Fail to parse expression " + expression);
            }
        }

        while (!stack.empty())
        {
            stringBuilder.append(stack.pop()).append(" ");
        }

        return stringBuilder.toString();
    }
}
