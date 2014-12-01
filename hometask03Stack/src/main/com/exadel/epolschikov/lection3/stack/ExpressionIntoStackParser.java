package main.com.exadel.epolschikov.lection3.stack;

/**
 * Created by ypolshchykau on 01.12.2014.
 */
public class ExpressionIntoStackParser {
    private Stack doubles= new Stack();
    private Stack operations = new Stack();

    public double getCalculatedResult(){
        return  Double.parseDouble(doubles.pop());
    }
}
