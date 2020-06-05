package cn.eilene.knowledge;

import java.time.*;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

/**
 * @Description 18个Java 8 日期处理的工具类
 * @Author MY-HE
 * @Date 2020-06-05 09:25
 */
public class DateDeal {


    public static void main(String[] args) {
        Instant now = Instant.now();
        System.out.println("now = " + now);

        LocalDate localDate = LocalDate.now();
        System.out.println("localDate = " + localDate);

        LocalTime localTime = LocalTime.now();
        System.out.println("localTime = " + localTime);

        LocalDateTime localDateTime = LocalDateTime.now();
        System.out.println("localDateTime = " + localDateTime);

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy年MM月dd日");
        System.out.println("formatter.format(localDate) = " + formatter.format(localDate));


        Clock clock = Clock.systemUTC();
        System.out.println("clock = " + clock.millis());

        Clock systemDefaultZone = Clock.systemDefaultZone();
        System.out.println("systemDefaultZone.millis() = " + systemDefaultZone.millis());

        Clock ctt = Clock.system(ZoneId.of("Asia/Shanghai"));
        System.out.println("ctt = " + ctt.millis());

        YearMonth yearMonth = YearMonth.now();
        System.out.printf("yearMonth =  %s, %d \n", yearMonth, yearMonth.lengthOfMonth());

        YearMonth cardExpiry = YearMonth.of(2019, Month.FEBRUARY);
        System.out.println("cardExpiry = " + cardExpiry);
    }
}
