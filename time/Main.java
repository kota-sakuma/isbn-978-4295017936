package time;

import java.util.Calendar;
import java.util.Date;
import java.text.SimpleDateFormat;

public class Main {

  public static void main(String[] args) {
    Date currentDate = new Date();
    Calendar calendar = Calendar.getInstance();
    calendar.setTime(currentDate);

    calendar.set(Calendar.DAY_OF_MONTH, calendar.get(Calendar.DAY_OF_MONTH) + 100);
    Date targetDate = calendar.getTime();
    SimpleDateFormat sdf = new SimpleDateFormat("西暦 yyyy 年 MM 月 dd 日");
    System.out.println("今日は" + sdf.format(currentDate));
    System.out.println("100 日後は" + sdf.format(targetDate));
  }
}
