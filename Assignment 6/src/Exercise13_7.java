
public class Exercise13_7 {

  public static void main(String[] args) {
    System.out.println("Methods from 'GeometicObject':");
    Square square = new Square(5);
    System.out.println(square);
    System.out.println();
    System.out.println("Area, Perimeter, 'howToColor' method: ");
    System.out.println(square.getArea());
    System.out.println(square.getPerimeter());
    square.howToColor();
  }

}
