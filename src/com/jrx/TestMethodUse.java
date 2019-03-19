package com.jrx;

import java.util.Date;
import java.util.function.Supplier;

/**
 * 方法引用的标准形式是：类名.方法名。(方法名不含括号)
 */
public class TestMethodUse {
    private Date createDate;
    public Date getCreateDate() {
        return createDate;
    }
    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }
   // 编写静态方法
    public  static String getnumber(){
        return  "这是引用静态方法";

    }
    public  String   getNumber2(){
        return "调用方法";
    }


}
