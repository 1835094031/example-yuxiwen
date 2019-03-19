package com.jrx;

import java.util.Arrays;
import java.util.concurrent.ThreadLocalRandom;

/**
 *增加了大量的新方法来对数组进行并行处理，最重要的是parallelSort()方法，因为它可以在多核机器上极大提高数组排序的速度
 */
public class ParallelArray {
      public static void main (String args[]){
          long[] arrayOfLong = new long[20000];
          //初始化数组，填充随机数parallelSetAll
          //ThreadLocalRandom类是JDK7在JUC包下新增的随机数生成器，它解决了Random类在多线程下多个线
          // 程竞争内部唯一的原子性种子变量而导致大量线程自旋重试的不足。ThreadLocalRandom
          //用于返回当前类的对象. ThreadLocalRandom.current()
          Arrays.parallelSetAll(arrayOfLong, index -> ThreadLocalRandom.current().nextInt(1000000));
          //通过Arrays类提供的静态函数stream()获取数组的流对象
          Arrays.stream(arrayOfLong).limit(10).forEach(i -> System.out.println(i));
          System.out.println();
          //多核机器上极大提高数组排序的速度
          Arrays.parallelSort(arrayOfLong);
          Arrays.stream(arrayOfLong).limit(10).forEach(i -> System.out.println(i));


    }
}
