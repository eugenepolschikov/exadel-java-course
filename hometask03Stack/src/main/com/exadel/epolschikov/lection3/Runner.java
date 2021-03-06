package main.com.exadel.epolschikov.lection3;


import main.com.exadel.epolschikov.lection3.logic.ExpressionSplitter;
import main.com.exadel.epolschikov.lection3.logic.InputData;
import main.com.exadel.epolschikov.lection3.stack.StackBuilder;

/**
 * Runner class-
 * other classes' instances creation
 * and test calculator logic
 */
public class Runner {
    public static void main(String[] args) {

//        evaluate 2 doubles
        /*InputData dataForCalculation= new InputData();
        dataForCalculation.numbersAndOperationInput();
        Calculator calculation= new Calculator();
        calculation.calculate(dataForCalculation.getLeftNumber(),dataForCalculation.getRightNumber(),
                dataForCalculation.getOperation());
        calculation.printAnswer();*/

//        evaluate expression
        InputData dataForCalculation= new InputData();
        dataForCalculation.inputExpressionToEvaluate();
        String expToEvaluate=dataForCalculation.getExpression();
        ExpressionSplitter splitExpIntoLists= new ExpressionSplitter(expToEvaluate);
        splitExpIntoLists.splitInputIntoNumbersAndOperations();
        splitExpIntoLists.formProperListsFromExpression();

        StackBuilder stackEval = new StackBuilder(splitExpIntoLists.getNums(),splitExpIntoLists.getOps());




    }
}
