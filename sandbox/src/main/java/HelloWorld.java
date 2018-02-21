class HelloWorld {
    public static void main(String[] args) {
        System.out.println("Hello World!");
        hello("Ivan");
        hello("Bohdan");

        double len = 5;
        double len2 = 10;
        System.out.println("Area of square is =  " + area(len));
        System.out.println("Area of rectangle is =  " + area(len, len2));
    }

    public static void hello(String name){
        System.out.println("Hello " + name );
    }

    static double area(double a){
        return a * a;
    }
    static double area(double a, double b){
        return a * b;
    }
}