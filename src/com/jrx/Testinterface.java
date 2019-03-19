package com.jrx;

/**
 * jdk1.8之前接口中不能含有非抽象方法
 * jdk1.8之后使用default 关键字可以含有非抽象方法
 * jdk1.8之前接口可以含有静态方法
 */
 interface  Testinterface {

     double getNumber(int s);
     default void getNumber(){
         System.out.println("hello world");
     }
     static void getName(){
         System.out.println("于西文");
     }

}
