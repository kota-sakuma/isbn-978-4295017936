package string;

public class Regex {

  public static void main(String[] args) {
    String text = "A00";
    System.out.println(text.matches(".*"));
    System.out.println(text.matches("A\\d\\d?"));
    System.out.println(text.matches("U[A-Z]{3}"));
  }
}
