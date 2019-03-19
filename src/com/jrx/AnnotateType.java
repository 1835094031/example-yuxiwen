package com.jrx;

import javax.swing.*;
import java.io.FileNotFoundException;
import java.io.Serializable;
import java.lang.annotation.ElementType;
import java.lang.annotation.Target;

/**Java8 为 ElementType 枚举增加了TYPE_PARAMETER、TYPE_USE两个枚举值，
 * 从而可以使用 @Target(ElementType_TYPE_USE) 修饰注解定义，这种注解被称为类型注解，可以用在任何使用到类型的地方。
 * TYPE_PARAMETER：表示该注解能写在类型参数的声明语句中。 类型参数声明如： <T>、<T extends Person>
 * TYPE_USE：表示注解可以再任何用到类型的地方使用，比如允许在如下位置使用：
 *
 * 创建对象（用 new 关键字创建）
 * 类型转换
 * 使用 implements 实现接口
 * 使用 throws 声明抛出异常
 *
 * 类型注解
 */
@Target(ElementType.TYPE_USE)
@interface NotNull{

}
@NotNull
public class AnnotateType implements Serializable {

    public static void main(@NotNull String [] args) throws FileNotFoundException {

        Object  obj = "fkjava.org";

        // 使用强制类型转换时使用
        String str = (@NotNull String) obj;
        System.out.println(str);
        //也可以在创建对象

    }

}
