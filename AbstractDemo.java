abstract class Shape {
    abstract void area();
}

class Circle extends Shape {
    void area() {
        double r = 5;
        System.out.println("Area = " + (3.14 * r * r));
    }
}

public class AbstractDemo {
    public static void main(String[] args) {
        Shape s = new Circle();
        s.area();
    }
}
