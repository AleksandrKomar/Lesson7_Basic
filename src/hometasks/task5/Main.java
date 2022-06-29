package hometasks.task5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import hometasks.task5.Calculator;


public class Main {
    public static void main(String[] args) throws IOException {


        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("������� ����� a: ");
        double a = Double.parseDouble(reader.readLine());

        System.out.print("������� �����  b: ");
        double b = Double.parseDouble(reader.readLine());

        System.out.print("������� �������� �� ������������(+, -, *, /):  - ");
        String operation = reader.readLine();

        reader.close();

        switch (operation) {
            case "+":
                System.out.println(a + " " + operation + " " + b + " = " + Calculator.add(a, b));
                break;
            case "-":
                System.out.println(a + " " + operation + " " + b + " = " + Calculator.sub(a, b));
                break;
            case "/":

                try {
                    System.out.println(a + " " + operation + " " + b + " = " + Calculator.div(a, b));
                } catch (ArithmeticException e) {
                    System.out.println(e.getMessage());
                }
                break;
            case "*":
                System.out.println(a + " " + operation + " " + b + " = " + Calculator.mul(a, b));
                break;
            default:
                System.out.println("������� ����������� ��������");
        }

    }

}
