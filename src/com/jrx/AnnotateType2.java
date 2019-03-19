package com.jrx;

import java.lang.annotation.*;

/**
 * 使用注解的一个限制是相同的注解在同一位置只能声明一次，不能声明多次。Java8引入了重复注解机制，这样相同的注解可以在同一地方声明多次。
 *
 * 重复注解机制本身必须用@Repeatable注解，事实上，这并不是语言层面上的改变，更多的是编译期的技巧，底层的原理保持不变。
 *
 * 重复注解
 */
public class AnnotateType2 {

    @Target(ElementType.TYPE)
    @Retention(RetentionPolicy.RUNTIME)
    public @interface Filters {
        Filter[] value();
    }

    @Target(ElementType.TYPE)
    @Retention(RetentionPolicy.RUNTIME)
    @Repeatable(Filters.class)
    public @interface Filter {
        String value();
    }

    @Filter("f1")
    @Filter("f2")
    public interface Filterable {}

    public static void main(String[] args) {
        for (Filter f : Filterable.class.getAnnotationsByType(Filter.class)) {
            System.out.println(f.value());
        }
        System.out.println(Filterable.class.getAnnotation(Filters.class));
    }





}
