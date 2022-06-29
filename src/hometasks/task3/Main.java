package hometasks.task3;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;

public class Main {

    public static void main(String[] args) throws Exception {

        Exception exception = new Exception("---������� �� ������!---");

        Price[] prices = new Price[2];

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        for (int i = 0; i < prices.length; i++) {

            System.out.println("������� ������������ ������ = ");
            String name = reader.readLine();

            System.out.print("������� ��� �������� = ");
            String shopName = reader.readLine();

            System.out.print("������� ���� ������ = ");
            double price = Double.parseDouble(reader.readLine());

            prices[i] = new Price(name, shopName, price);
        }

        Arrays.sort(prices, Comparator.comparing(Price::getShopName));

        for (int i = 0; i < prices.length; i++) {
            System.out.println(prices[i].toString());
        }

        System.out.print("������� ������������ ��������: ");
        String shop_name = reader.readLine();

        reader.close();

        boolean ff = false;

        for (Price temp : prices) {

            if (temp != null && temp.getShopName().equals(shop_name)) {
                // ������� �����
                System.out.println("������:\n \t" + temp.getName());
                ff = true;
            }
        }

        if (!ff) {
            System.out.println(exception.getMessage());
        }
    }

}

