public class CalcArea {

  public static void main(String[] args) {
    calcTriangleArea(10.0, 5.0);
    calcCircleArea(5.0);
  }

  public static void calcTriangleArea(double bottom, double height) {
    double area = bottom * height / 2;
    System.out.println("Triangle area: " + area + " cm^2");
  }

  public static void calcCircleArea(double radius) {
    final double PI = 3.14;
    double area = radius * radius * PI;
    System.out.println("Circle area: " + area + " cm^2");
  }
}
