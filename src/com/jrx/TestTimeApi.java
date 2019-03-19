package com.jrx;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

/**
 * Java 8通过发布新的Date-Time API (JSR 310)来进一步加强对日期与时间的处理。
 * Local(本地) − 简化了日期时间的处理，没有时区的问题。
 *
 * Zoned(时区) − 通过制定的时区处理日期时间
 *
 * 新的java.time包涵盖了所有处理日期，时间，日期/时间，时区，时刻（instants），过程（during）与时钟（clock）的操作。
 *
 * Instant——它代表的是时间戳
 * LocalDate——不包含具体时间的日期，比如2014-01-14。它可以用来存储生日，周年纪念日，入职日期等。
 * LocalTime——它代表的是不含日期的时间
 * LocalDateTime——它包含了日期及时间，不过还是没有偏移信息或者说时区。
 * ZonedDateTime——这是一个包含时区的完整的日期时间，偏移量是以UTC/格林威治时间为基准的
 */
public class TestTimeApi {
     public static void main (String args[]){
      //创建LocalDate的方式
        LocalDate now = LocalDate.now() ;
        LocalDate of = LocalDate.of(2019, 1, 15);
        LocalDate parse = LocalDate.parse("2019-01-15");
        LocalDate parse1 = LocalDate.parse("2019/01/15", DateTimeFormatter.ofPattern("yyyy/MM/dd"));

         //按照后面给定字段添加指定数量的日期
         LocalDate now2 = LocalDate.now();
         LocalDate plusDate = now2.plus(4, ChronoUnit.YEARS);
         System.out.println(plusDate);

         //计算日期的间隔
         LocalDate now3 = LocalDate.now(); // 2019-01-15
         LocalDate of2 = LocalDate.of(1989, 07, 02);
         long until = now3.until(of2, ChronoUnit.MONTHS);
         System.out.println(until);





    }

}
