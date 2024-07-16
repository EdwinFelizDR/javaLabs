package Glab303104;

public class myRunner {
    public static void main(String[] args) {

        Circle c1 = new Circle(1, 2, 2);
        Triangle t1 = new Triangle(1,1,5.0,3.0);
        Rectangle r1 = new Rectangle(1,1,2.0,3.0);

        System.out.println("Area of Circle " + c1.getArea());
        System.out.println("Coordinates are " + c1.getCoordinate());

        c1.moveDown();
        System.out.println("After move Down, Coordinates are " + c1.getCoordinate());

        c1.moveRight();
        System.out.println("After move right, Coordinates are " + c1.getCoordinate());

        c1.moveUp();
        System.out.println("After move Up, Coordinates are " + c1.getCoordinate());

        c1.moveLeft();
        System.out.println("After move left, Coordinates are " + c1.getCoordinate());


        System.out.println("--------Test Polymorphism-------");
        Movable c2 = new Circle(5, 10, 200);  // upcast
        c2.moveUp();
        System.out.println("After move up , Coordinates are " + c2.getCoordinate());

        c2.moveLeft();
        System.out.println("After move Left , Coordinates are " + c2.getCoordinate());


        System.out.println("---------------------------------------------");
        System.out.println("Practice Task: ");
        System.out.println("Area of Triangle: " + t1.getArea());
        System.out.println("Area of rectangle: " + r1.getArea());
    }
}

