package main.com.exadel.epolschikov.lection3.logic;

import main.com.exadel.epolschikov.lection3.helpers.DataValidator;

import java.util.List;

import static main.com.exadel.epolschikov.lection3.helpers.DataValidator.*;


/**
 * Created by dell on 02.12.2014.
 */
public class ExpressionSplitter {
    private String expression;
    private String[] operations;
    private String[] doubles;
    List<Double> nums;
    List<String> ops;


    public ExpressionSplitter(String str){
        this.expression = str;
    }

    public void splitInputIntoNumbersAndOperations() {



        this.operations = this.expression.split(NUMERIC_REGEXP);
        this.doubles = this.expression.split(OPERATION_REGEXP);

        arrayObtainedPrint(operations,"array with operations print" );
        arrayObtainedPrint(doubles,"array with numbers print" );
        /*
        String[] res = new String[operations.length + doubles.length -1 ];
        for (int i = 0; i < res.length; i++) res[i] = i % 2 == 0 ? doubles[i / 2] : operations[i / 2 + 1];

        return res;*/

    }

    public void iterateThroughArrayAndFillListWithProperData(String[] a){
        for(int i=a.length-1; i>=0; i--){
            if(a[i].length()==0) {
                continue;
            }
            if(a[i].matches(ALPHABETIC_REGEXP) && a[i].length()>1) {
                this.ops.add(0,a[i]);
            }
            if(a[i].matches(OPERATION_REGEXP) && a[i].length()>1){
                for(int count=a[i].length()-1;count>=0; count--){
                    this.ops.add(0,a[i].substring(count-1,count));
                }
            }

            if(a[i].matches(NUMERIC_REGEXP)) {
                this.nums.add(0,Double.parseDouble(a[i]));
            }
        }


    }

    //    this method was created for debugging purposes
    public void arrayObtainedPrint(String[] arr,String message ){
        System.out.println(message);
        for(int count=0; count<arr.length; count++){
            System.out.println(arr[count]);
        }
    }


}
