package time;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class TimeApi {

  public static void main(String[] args) {
    LocalDateTime now = LocalDateTime.now();
    LocalDateTime target = now.plusDays(100);
    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("西暦 yyyy 年 MM 月 dd 日");
    System.out.println(now.format(formatter));
    System.out.println(target.format(formatter));
  }
}
