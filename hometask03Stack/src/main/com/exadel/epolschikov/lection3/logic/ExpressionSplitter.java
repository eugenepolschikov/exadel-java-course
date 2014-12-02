package main.com.exadel.epolschikov.lection3.logic;

import main.com.exadel.epolschikov.lection3.helpers.DataValidator;

import java.util.ArrayList;
import java.util.List;

import static main.com.exadel.epolschikov.lection3.helpers.DataValidator.*;


/**
 * Created by dell on 02.12.2014.
 */
public class ExpressionSplitter {
    private String expression;
    private String[] operations;
    private String[] doubles;
    private List<String> ops;


    private List<String> nums;

    public List<String> getOps() {
        return ops;
    }

    public List<String> getNums() {
        return nums;
    }


    public ExpressionSplitter(String str) {
        this.expression = str;
        nums = new ArrayList<String>();
        ops = new ArrayList<String>();


    }

    public void splitInputIntoNumbersAndOperations() {


        this.operations = this.expression.split(NUMERIC_REGEXP);
        this.doubles = this.expression.split(OPERATION_REGEXP);
        /*
        String[] res = new String[operations.length + doubles.length -1 ];
        for (int i = 0; i < res.length; i++) res[i] = i % 2 == 0 ? doubles[i / 2] : operations[i / 2 + 1];

        return res;*/

    }

    public void iterateThroughArrayAndFillListWithProperData(String[] a) {
        for (int i = a.length - 1; i >= 0; i--) {
            if (a[i].length() == 0) {
                continue;
            }
            if (a[i].matches(ALPHABETIC_REGEXP) && a[i].length() > 1) {
                this.ops.add(0, a[i]);
                continue;
            }
            if (a[i].matches(OPERATION_REGEXP)) {

                if (a[i].trim().length() > 1) {
                    for (int count = a[i].length() - 1; count >= 0; count--) {
                        this.ops.add(0, String.valueOf(a[i].charAt(count)));
                    }
                    continue;
                } else if (a[i].length() > 0 && a[i].length() < 2) {
                    this.ops.add(0, a[i]);
                    continue;
                }
            }
            if (a[i].matches(NUMERIC_REGEXP)) {
//                this.nums.add(0, Double.parseDouble(a[i]));
                this.nums.add(0, a[i]);
                continue;
            }

        }
    }

    //    this method was created for debugging purposes
    public void arrayObtainedPrint(String[] arr, String message) {
        System.out.println(message);
        for (int count = 0; count < arr.length; count++) {
            System.out.println(arr[count]);
        }
    }


    public void formProperListsFromExpression() {

        iterateThroughArrayAndFillListWithProperData(operations);
        iterateThroughArrayAndFillListWithProperData(doubles);
//        listsPrint();
    }

    public void listsPrint() {
        for (int count = 0; count < nums.size(); count++) {
            System.out.println(nums.get(count));
        }
        System.out.println("=============");
        for (int count = 0; count < ops.size(); count++) {
            System.out.println(ops.get(count));
        }
    }


}
