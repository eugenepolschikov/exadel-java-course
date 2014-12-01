package main.com.exadel.epolschikov.lection3.stack;

import java.util.List;

/**
 * Created by ypolshchykau on 01.12.2014.
 * implementation based on list operations
 */
public class Stack {
    private List<String> stack;

    public void push(String str){
        stack.add(0,str);
    }

    public String pop(){
        String result= stack.get(0);
        stack.remove(0);
        return result;

    }

    public boolean isEmpty(){
        return stack.size()==0;
    }
}
