package tut.ac.za.ejb.bl;

import javax.ejb.Stateless;

@Stateless
public class CalculatorEJB implements CalculatorEJBLocal {

    @Override
    public int addition(int a, int b) {
        return a + b;
    }

    @Override
    public int multiplication(int a, int b) {
        return a * b;
    }

    @Override
    public int subtraction(int a, int b) {
        if (a > b) {
            return a - b;
        } else {
            return b - a;
        }
    }

    @Override
    public double division(int a, int b) {
        return a / b;
    }

}
