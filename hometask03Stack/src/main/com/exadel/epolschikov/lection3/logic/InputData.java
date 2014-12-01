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

    private String[] splitExpression;

    public String[] getSplitExpression() {
        return splitExpression;
    }


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


    public void splitInputIntoNumbersAndOperations() {



        String[] operations = this.expression.split(DataValidator.NUMERIC_REGEXP);
        String[] notOperations = this.expression.split(DataValidator.OPERATION_REGEXP);

        arrayObtainedPrint(operations,"array with operations print" );
        arrayObtainedPrint(notOperations,"array with numbers print" );
        /*
        String[] res = new String[operations.length + notOperations.length -1 ];
        for (int i = 0; i < res.length; i++) res[i] = i % 2 == 0 ? notOperations[i / 2] : operations[i / 2 + 1];

        return res;*/

    }

    public void arrayObtainedPrint(String[] arr,String message ){
        System.out.println(message);
        for(int count=0; count<arr.length; count++){
            System.out.println(arr[count]);
        }
    }


}
