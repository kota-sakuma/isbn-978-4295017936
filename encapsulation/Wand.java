package encapsulation;

public class Wand {

  String name;
  double power;

  public String getName() {
    return this.name;
  }

  public double getPower() {
    return this.power;
  }

  public void setName(String name) {
    if (name == null || name.length() < 3) {
      throw new IllegalArgumentException("Name must be at least 3 characters long.");
    }
    this.name = name;
  }

  public void setPower(double power) {
    if (power < 0.5 || power > 100.0) {
      throw new IllegalArgumentException("Power must be between 0.5 and 100.0.");
    }
    this.power = power;
  }
}
