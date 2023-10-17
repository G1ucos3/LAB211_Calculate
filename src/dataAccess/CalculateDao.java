package dataAccess;

import common.Validate;
import model.*;

/**
 *
 * @author ASUS
 */
public class CalculateDao {

    private static CalculateDao instance = null;
    Validate validate = new Validate();

    public static CalculateDao Instance() {
        if (instance == null) {
            synchronized (CalculateDao.class) {
                if (instance == null) {
                    instance = new CalculateDao();
                }
            }
        }
        return instance;
    }

    public void RectangleD(Rectangle rectangle) {
        rectangle.setWidth(validate.checkDouble("Enter Width"));
        rectangle.setLength(validate.checkDouble("Enter Length"));
        rectangle.setArea(rectangle.getWidth() * rectangle.getLength());
        rectangle.setPerimeter((rectangle.getWidth() + rectangle.getLength()) * 2);
        rectangle.printResult();
    }

    public void CircleD(Circle circle) {
        circle.setRadius(validate.checkDouble("Enter Radius"));
        circle.setArea(Math.PI * Math.pow(circle.getRadius(), 2));
        circle.setPerimeter(Math.PI * circle.getRadius() * 2);
        circle.printResult();
    }

    public boolean TriangleD(Triangle triangle) {
        triangle.setA(validate.checkDouble("Enter Side A"));
        triangle.setB(validate.checkDouble("Enter Side B"));
        triangle.setC(validate.checkDouble("Enter Side C"));
        if (!validate.checkTriangle(triangle)) {
            return false;
        }
        triangle.setPerimeter(triangle.getA() + triangle.getB() + triangle.getC());
        double p = triangle.getPerimeter() / 2;
        triangle.setArea(Math.sqrt(p * (p - triangle.getA())
                * (p - triangle.getB())
                * (p - triangle.getC())));
        triangle.printResult();
        return true;
    }
}
