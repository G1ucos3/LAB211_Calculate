package model;

/**
 *
 * @author ASUS
 */
public class Rectangle extends Shape {

    private double width, length;
    private double perimeter, area;

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
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
        System.out.println("Width: " + this.getWidth()
                + "\nLength: " + this.getLength()
                + "\nArea: " + this.getArea()
                + "\nPerimeter: " + this.getPerimeter());
    }

}
