package com.jrx;

import java.util.Collection;
import java.util.HashSet;
import java.util.stream.Stream;

/**
 * Stream是一个通用的流接口 相当于一个 Iterator Stream 可以并行化操作，迭代器只能命令式地、串行化操作。
 * 顾名思义，当使用串行方式去遍历时，每个 item 读完后再读下一个 item。
 * 而使用并行去遍历时，数据会被分成多个段，其中每一个都在不同的线程中处理，然后将结果一起输出。
 *
 *
 */
public class TestStream {
    public static void main (String args[]){
        Collection<String> books=new HashSet<>();
        books.add("12");
        books.add("c3po678");
        Stream<String> str=books.stream();//变成流
        //包含的678 的输出个数
        System.out.println(str.filter(ele -> ((String) ele).contains("678")).count());



    }
}
