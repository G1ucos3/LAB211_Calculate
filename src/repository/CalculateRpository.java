package repository;

import dataAccess.CalculateDao;
import model.*;

/**
 *
 * @author ASUS
 */
public class CalculateRpository implements ICalculate {

    @Override
    public void Rectangle(Rectangle rectangle) {
        CalculateDao.Instance().RectangleD(rectangle);
    }

    @Override
    public void Circle(Circle circle) {
        CalculateDao.Instance().CircleD(circle);
    }

    @Override
    public void Triangle(Triangle triangle) {
        if (!CalculateDao.Instance().TriangleD(triangle)) {
            System.out.println("There's no such triangle.");
        }
    }
}
