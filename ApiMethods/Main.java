package ApiMethods;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.logging.SimpleFormatter;

public class Main {
    public static void main(String[] args) throws Exception{
        // long start = System.currentTimeMillis();
        // try {
        // // Thread.sleep(5000);
        // } catch(Exception e){
        // }
        // long end = System.currentTimeMillis();

        // System.out.println("実行時間は" + (end - start) + "ミリ秒でした");

        // Date now = new Date();
        // System.out.println(now);
        // System.out.println(now.getTime());

        // Date past = new Date(1316622225935L);
        // System.out.println(past);

        // Calendar c = Calendar.getInstance();
        // c.setTime(now);

        // int y = c.get(Calendar.YEAR);
        // System.out.println("今年は" + y + "年です");
        // c.set(2010,8,22,1,23,45);
        // c.set(Calendar.YEAR, 2011);
        // Date past = c.getTime();
        // System.out.println(c);

        // Date now = new Date();
        // SimpleDateFormat f = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");

        // String s = f.format(now);
        // System.out.println(s);

        // Date d = f.parse("2011/09/22 01:23:45");
        // System.out.println(d);

        // int i1 = 15;
        // Integer i2 = i1;
        // Integer i3 = Integer.valueOf(i1);
        // System.out.println(i2);

        // Date now = new Date();
        // Calendar c = Calendar.getInstance();
        // c.setTime(now);
        
        // int day = c.get(Calendar.DAY_OF_MONTH);
        // day += 100;
        // c.set(Calendar.DAY_OF_MONTH, day);
        // Date future = c.getTime();
        // SimpleDateFormat f = new SimpleDateFormat("YYYY/MM/dd");
        // System.out.println(f.format(future));

        Account a = new Account("4649", 1592);
        System.out.println(a);

        Account a2 = new Account(" 4649", 1111);
        System.out.println(a.equals(a2));

    }
}
