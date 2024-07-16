package Glab303104;

public class Rectangle extends Shape implements Movable {
    private int x, y;   // x and y coordinates of the point
    private double w,l;

    public Rectangle(int x, int y, double w, double l) {
        this.x = x;
        this.y = y;
        this.w = w;
        this.l = l;
    }

    public Rectangle(double w, double l) {
        this.w = w;
        this.l = l;
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
    public String getCoordinate() {
        return  "(" + x + "," + y + ")";
    }

    @Override
    public double getArea() {
        //Area of a Rectangle = (Length × Width)
        double area;
        area = this.l * this.w;
        return area;
    }
}
