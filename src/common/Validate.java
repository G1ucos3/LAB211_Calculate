package common;

import java.util.InputMismatchException;
import java.util.Scanner;
import model.Triangle;

/**
 *
 * @author ASUS
 */
public class Validate {

    public double checkDouble(String s) {
        double num = 0;
        while (num < 1) {
            try {
                Scanner sc = new Scanner(System.in);
                System.out.print(s + ": ");
                num = sc.nextDouble();
            } catch (InputMismatchException e) {
                System.err.println("Please input a number (>0)");

                System.out.println("Enter again: ");
            }
        }
        return num;
    }

    public boolean checkTriangle(Triangle triangle) {
        if (triangle.getA() + triangle.getB() < triangle.getC()
                || triangle.getA() + triangle.getC() < triangle.getB()
                || triangle.getB() + triangle.getC() < triangle.getA()) {
            return false;
        }
        return true;
    }
}
