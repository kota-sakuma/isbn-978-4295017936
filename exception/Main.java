package exception;

import java.io.IOException;

public class Main {

  public static void main(String[] args) throws IOException {
    try {
      String s = null;
      System.out.println(s.length());
    } catch (NullPointerException e) {
      e.printStackTrace();
    }

    try {
      int i = Integer.parseInt("三");
    } catch (NumberFormatException e) {
      e.printStackTrace();
    } catch (Exception e) {
      e.printStackTrace();
    }

    throw new IOException("test");
  }
}
