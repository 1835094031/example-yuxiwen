package com.jrx;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * 用于lambda表达式练习数组比较
 */
public class TestLambda  {
    public static void main (String args[]){

        List<String> names= new ArrayList<>();
        names.add("dd");
        names.add("ss");


        Collections.sort(names,(String a , String b) ->{
                    return  b.compareTo(a);
                }
        );

        names.forEach(c->System.out.println(c));


    }

}
