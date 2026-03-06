public class GuessTheNumber {

  public static void main(String[] args) {

    System.out.println("[Guess The Number]");

    int ans = new java.util.Random().nextInt(10);

    try (java.util.Scanner scanner = new java.util.Scanner(System.in)) {
      for (int i = 0; i < 5; i++) {
        System.out.print("Enter a number from 0 to 9: ");
        int num = scanner.nextInt();
        if (num == ans) {
          System.out.println("You guessed the correct number!");
          break;
        } else {
          System.out.println("You guessed the wrong number!");
        }
      }
    }

    System.out.println("The game is over.");
  }
}
