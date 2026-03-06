public class Menu {

  public static void main(String[] args) {

    System.out.print("[Menu] 1: Search | 2: Register | 3: Delete | 4: Change > ");

    try (java.util.Scanner scanner = new java.util.Scanner(System.in)) {
      int selected = scanner.nextInt();

      switch (selected) {
        case 1:
          System.out.println("Searching...");
          break;
        case 2:
          System.out.println("Registering...");
          break;
        case 3:
          System.out.println("Deleting...");
          break;
        case 4:
          System.out.println("Changing...");
          break;
        default:
          System.out.println("The selected number is not valid.");
          break;
      }
    }
  }
}
