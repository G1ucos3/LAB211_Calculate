package model;

/**
 *
 * @author ASUS
 */
public class Triangle extends Shape {

    private double a, b, c;
    private double perimeter, area;

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }

    public double getC() {
        return c;
    }

    public void setC(double c) {
        this.c = c;
    }

    public void setPerimeter(double perimeter) {
        this.perimeter = perimeter;
    }

    public void setArea(double area) {
        this.area = area;
    }

    @Override
    public double getPerimeter() {
        return perimeter;
    }

    @Override
    public double getArea() {
        return area;
    }

    @Override
    public void printResult() {
        System.out.println("Side A: " + this.getA()
                + "\nSide B: " + this.getB()
                + "\nSide C: " + this.getC()
                + "\nArea: " + this.getArea()
                + "\nPerimeter: " + this.getPerimeter());
    }

}
