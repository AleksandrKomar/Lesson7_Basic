package hometasks.task5;

public class Calculator {

    static double add(double a, double b) {
        return a + b;
    }

    static double div(double a, double b) {
        double c = 0;

        if (b != 0) {
            c = a / b;
        } else {
            throw new ArithmeticException("������� �� ���� ����������");
        }
        return c;
    }

    static double mul(double a, double b) {
        return a * b;
    }

    static double sub(double a, double b) {
        return a - b;
    }

}
