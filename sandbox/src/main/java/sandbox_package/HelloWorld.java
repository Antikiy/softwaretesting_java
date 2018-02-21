package sandbox_package;

class HelloWorld {
  public static void main(String[] args) {
    System.out.println("Hello World!");
    hello("Ivan");
    hello("Bohdan");
    System.out.println("__________");

    double len = 5;
    double len2 = 10;

    Square s = new Square(len);
    Rectangle r = new Rectangle(len, len2);
    System.out.println("Area of square is =  " + s.area());
    System.out.println("Area of rectangle is =  " + r.area());
  }

  public static void hello(String name) {
    System.out.println("Hello " + name);
  }


}