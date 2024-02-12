package codecool.com.subway.orderitem.drink;

import codecool.com.subway.orderitem.OrderItem;

public class Drink extends OrderItem {
    private Flavor flavor;

    public Drink(Flavor flavor) {
        this.flavor = flavor;
    }

    @Override
    public double calculatePrice() {
        return flavor.getPrice();
    }

    @Override
    public String toString() {
        return "Drink{" +
                "flavor=" + flavor +
                '}';
    }
}
