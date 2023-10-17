package controller;

import model.Circle;
import model.Rectangle;
import model.Shape;
import model.Triangle;
import repository.CalculateRpository;
import view.Menu;

/**
 *
 * @author ASUS
 */
public class CalculateController extends Menu {

    static String[] mc = {"Rectangle", "Circle", "Triangle", "Exit"};
    Shape shape;
    CalculateRpository cr;

    public CalculateController() {
        super("Calculator Shape Program", mc);
        cr = new CalculateRpository();
    }

    @Override
    public void execute(int choice) {
        switch (choice) {
            case 1:
                System.out.println("-----Rectangle-----");
                shape = new Rectangle();
                cr.Rectangle((Rectangle) shape);
                break;
            case 2:
                System.out.println("-----Circle-----");
                shape = new Circle();
                cr.Circle((Circle)shape);
                break;
            case 3:
                System.out.println("-----Triangle-----");
                shape = new Triangle();
                cr.Triangle((Triangle)shape);
                break;
            case 4:
                System.out.println("Close..");
                System.exit(0);
            default:
                System.out.println("Choose again.");
                break;
        }
    }
}
