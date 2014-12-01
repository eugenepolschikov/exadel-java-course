package main.com.exadel.epolschikov.lection3.logic;



import main.com.exadel.epolschikov.lection3.math.*;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by ypolshchykau on 27.11.2014.
 */
public class OperationsMapper {


    private static Map<String, BinaryOperation> operations = new HashMap<String, BinaryOperation>();

    static {

        operations.put("*", new Multiplication());
        operations.put("+", new Addition());
        operations.put("/", new Division());
        operations.put("-", new Subtraction());
        operations.put("^", new Power());
        operations.put("pow", new Power());
        operations.put("POW", new Power());
        operations.put("POWER", new Power());
        operations.put("log", new Log());
        operations.put("LOG",new Log());

    }

    public static Map<String, BinaryOperation> getOperations() {
        return operations;
    }


}
