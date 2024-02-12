package codecool.com.subway.orderitem.drink;

public enum Flavor {
    COCA_COLA(20),
    FANTA(18),
    ICE_TEA(16);

    private int price;

    Flavor(int price) {
        this.price = price;
    }

    public int getPrice() {
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
