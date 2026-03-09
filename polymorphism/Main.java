package polymorphism;

public class Main {

  public static void main(String[] args) {

    Y[] ys = {new A(), new B()};
    for (Y y : ys) {
      y.b();
    }
  }
}
