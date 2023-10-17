package model;

/**
 *
 * @author ASUS
 */
public class Circle extends Shape {
    private double radius;
    private double perimeter;
    private double area;

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
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
        System.out.println("Radius: " + this.getRadius()
                + "\nArea: " + this.getArea()
                + "\nPerimeter: " + this.getPerimeter());
    }
    
    
}
