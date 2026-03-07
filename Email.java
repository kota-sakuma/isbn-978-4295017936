public class Email {

  public static void main(String[] args) {
    email("title", "java@example.com", "Hello, world!");
    email("java@example.com", "Hello, world!");
  }

  public static void email(String title, String address, String text) {
    System.out.println("Sent an email to " + address + ".");
    System.out.println("Title: " + title);
    System.out.println("Body: " + text);
  }

  public static void email(String address, String text) {
    System.out.println("Sent an email to " + address + ".");
    System.out.println("Title: No title");
    System.out.println("Body: " + text);
  }
}
