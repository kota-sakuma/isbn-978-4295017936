package collection;

import java.util.List;
import java.util.Map;

public class Main {

  public static void main(String[] args) {
    List<Hero> heroes = createHeroList();

    printHeroNames(heroes);

    Map<String, Integer> defeatedCounts = createDefeatedCounts();

    printDefeatedCounts(defeatedCounts);
  }

  private static List<Hero> createHeroList() {
    return List.of(new Hero("Saito"), new Hero("Suzuki"));
  }

  private static void printHeroNames(List<Hero> heroes) {
    for (Hero hero : heroes) {
      System.out.println(hero.getName());
    }
  }

  private static Map<String, Integer> createDefeatedCounts() {
    return Map.of("Saito", 3, "Suzuki", 7);
  }

  private static void printDefeatedCounts(Map<String, Integer> defeatedCounts) {
    for (Map.Entry<String, Integer> entry : defeatedCounts.entrySet()) {
      String heroName = entry.getKey();
      Integer defeatedCount = entry.getValue();
      System.out.println(heroName + " has defeated " + defeatedCount + " enemies.");
    }
  }
}
