package encapsulation;

public class Wizard {

  private String name;
  private int hp;
  private int mp;
  private Wand wand;

  public Wizard(String name, int hp, int mp, Wand wand) {
    this.name = name;
    this.hp = hp;
    this.mp = mp;
    this.wand = wand;
  }

  public String getName() {
    return this.name;
  }

  public void setName(String name) {
    if (name == null || name.length() < 3) {
      throw new IllegalArgumentException("Name must be at least 3 characters long.");
    }
    this.name = name;
  }

  public int getHp() {
    return this.hp;
  }

  public void setHp(int hp) {
    if (hp < 0) {
      this.hp = 0;
    } else {
      this.hp = hp;
    }
  }

  public int getMp() {
    return this.mp;
  }

  public void setMp(int mp) {
    if (mp < 0) {
      throw new IllegalArgumentException("MP must be greater than 0.");
    }
    this.mp = mp;
  }

  public Wand getWand() {
    return this.wand;
  }

  public void setWand(Wand wand) {
    if (wand == null) {
      throw new IllegalArgumentException("Wand must not be null.");
    }
    this.wand = wand;
  }

  public void heal(Hero hero) {
    int basePoint = 10;
    int recoverPoint = (int) (basePoint * this.getWand().getPower());
    hero.setHp(hero.getHp() + recoverPoint);
    System.out.println("Recovered " + hero.getName() + "'s HP by " + recoverPoint + " points.");
  }
}
