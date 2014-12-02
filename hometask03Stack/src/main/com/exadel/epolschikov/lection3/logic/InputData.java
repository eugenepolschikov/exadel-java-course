package main.com.exadel.epolschikov.lection3.logic;


import main.com.exadel.epolschikov.lection3.helpers.DataValidator;

import java.util.Scanner;

import static main.com.exadel.epolschikov.lection3.helpers.DataValidator.isNumeric;


/**
 * Created by ypolshchykau on 27.11.2014.
 */
public class InputData {
    private String left;
    private String right;
    private String operation;
    private String expression;



    public void numbersAndOperationInput() {

        Scanner in = new Scanner(System.in);

        System.out.println("enter first number:");
        left = in.nextLine();

        if (!isNumeric(left)) {
            throw new ArithmeticException("illegal double value: " + left);
        }

        System.out.println("enter second number:");
        right = in.nextLine();

        if (!isNumeric(right)) {
            throw new ArithmeticException("illegal double value: " + right);
        }

        System.out.println("enter operation:");
        operation = in.nextLine();

        if (!DataValidator.isOperation(operation)) {
            throw new IllegalArgumentException("illegal operation value: " + operation);
        }

        in.close();

    }

    public double getLeftNumber() {
        return Double.parseDouble(left);
    }

    public double getRightNumber() {
        return Double.parseDouble(right);
    }


    public String getOperation() {
        return operation;
    }


    public void inputExpressionToEvaluate() {

        Scanner in = new Scanner(System.in);

        System.out.println("input expression to evaluate:\n");
        this.expression = in.nextLine();
        in.close();

    }

    public String getExpression() {
        return expression;
    }



}
