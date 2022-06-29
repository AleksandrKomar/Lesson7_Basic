package hometasks.task3;

public class Price {

    private String name;
    private String shopName;
    private double price;

    public Price(String name, String shopName, double price) {
        this.name = name;
        this.shopName = shopName;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public String getShopName() {
        return shopName;
    }

    @Override
    public String toString() {
        return "Товар = " + this.name + "; Магазин = " + this.shopName + "; стоимость = " + this.price;
    }

}
