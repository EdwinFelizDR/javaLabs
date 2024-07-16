package Glab303104;

public class Triangle extends Shape implements Movable {
    private double h,b;
    private int x, y;   // x and y coordinates of the point

    public Triangle(int x, int y, double h, double b) {
        this.x = x;
        this.y = y;
        this.h = h;
        this.b = b;
    }

    public Triangle(double h, double b) {
        this.h = h;
        this.b = b;
    }

    @Override
    public String getCoordinate() {
        return  "(" + x + "," + y + ")";
    }

    @Override
    public void moveUp() {
        y++;
    }

    @Override
    public void moveDown() {
        y--;
    }

    @Override
    public void moveLeft() {
        x--;
    }

    @Override
    public void moveRight() {
        x++;
    }

    @Override
    public double getArea() {
        double area= ((this.h * this.b)/2);
        return area;
    }
}
