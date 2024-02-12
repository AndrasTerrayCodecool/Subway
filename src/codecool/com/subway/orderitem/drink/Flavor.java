package codecool.com.subway.orderitem.drink;

public enum Flavor {
    COCA_COLA(4.0),
    FANTA(3.8),
    ICE_TEA(3.6);

    private double price;

    Flavor(double price) {
        this.price = price;
    }

    public double getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "Flavor{" +
                "Flavor=" + this.name() +
                "price=" + price +
                '}';
    }
}
