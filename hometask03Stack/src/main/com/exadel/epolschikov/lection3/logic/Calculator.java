package main.com.exadel.epolschikov.lection3.logic;


import main.com.exadel.epolschikov.lection3.math.BinaryOperation;

/**
 * Created by ypolshchykau on 27.11.2014.
 * this ones evaluates two numbers and operation
 */
public class Calculator {
    private double answer;

    public void calculate(double left, double right, String operation) {
        BinaryOperation op = OperationsMapper.getOperations().get(operation);
        if (op != null) {
            answer = op.resultFor(left, right);
        } else {
            throw new RuntimeException("Error: Unknown operator");
        }

    }

    public void printAnswer() {
        System.out.println("answer= " + String.valueOf(answer));
    }


}
