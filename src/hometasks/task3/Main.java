package hometasks.task3;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;

public class Main {

    public static void main(String[] args) throws Exception {

        Exception exception = new Exception("---Магазин не найден!---");

        Price[] prices = new Price[2];

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        for (int i = 0; i < prices.length; i++) {

            System.out.println("Введите наименование товара = ");
            String name = reader.readLine();

            System.out.print("Введите имя магазина = ");
            String shopName = reader.readLine();

            System.out.print("Введите цену товара = ");

            double price = Double.parseDouble(reader.readLine());

            prices[i] = new Price(name, shopName, price);
        }

        Arrays.sort(prices, Comparator.comparing(Price::getShopName));

        for (Price temp: prices ) {
            System.out.println(temp.toString());
        }

        System.out.print("Введите наименование магазина: ");
        String shop_name = reader.readLine();

        reader.close();

        boolean ff = false;

        for (Price temp : prices) {

            if (temp != null && temp.getShopName().equals(shop_name)) {
                // выведем товар
                System.out.println("Товары:\n \t" + temp.getName());
                ff = true;
            }
        }

        if (!ff) {
            try {
                throw exception;
            } catch (Exception e) {
                System.out.println(exception.getMessage());
            }
        }

    }
}


