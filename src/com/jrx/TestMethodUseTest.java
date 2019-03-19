package com.jrx;

import java.util.function.Supplier;

public class TestMethodUseTest {
    public  static  void main (String [] args){

        String str=  TestMethodUse.getnumber();
        System.out.println(str);
        TestMethodUse testMethodUse=new TestMethodUse();
        Supplier<String> stringSupplier = () -> testMethodUse.getNumber2();
        System.out.println(stringSupplier);
        Supplier<String> stringSupplier2 = testMethodUse::getNumber2;
        System.out.println(stringSupplier2);




    }
}
