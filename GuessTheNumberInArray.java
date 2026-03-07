public class GuessTheNumberInArray {

  public static void main(String[] args) {
    int[] numbers = {3, 4, 9};

    System.out.print("Enter a number: ");

    try (java.util.Scanner scanner = new java.util.Scanner(System.in)) {
      int input = scanner.nextInt();
      for (int number : numbers) {
        if (input == number) {
          System.out.println("You guessed the correct number!");
          return;
        }
      }

      System.out.println("You guessed the wrong number!");
    }
  }
}
