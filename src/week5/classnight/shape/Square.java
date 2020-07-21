package week5.classnight.shape;

public class Square implements Shape {
  double side;
  
  public Square(double side) {
    this.side = side;
  }
  
  @Override
  public double area() {
    return side * 2;
  }

  @Override
  public double perimeter() {
    return side * 4;
  }

  public static void main(String[] args) {
    Square square = new Square(3.3);
    
    System.out.println("area: " + square.area() + ", perimeter: " + square.perimeter());
  }
}
