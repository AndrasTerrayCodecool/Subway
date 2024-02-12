package codecool.com.subway;

import codecool.com.subway.orderitem.drink.Drink;
import codecool.com.subway.orderitem.drink.Flavor;
import codecool.com.subway.orderitem.OrderItem;
import codecool.com.subway.orderitem.sandwich.Ingredient;
import codecool.com.subway.orderitem.sandwich.Sandwich;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Restaurant {
    private String name;
    private List<OrderItem> orderItems = new ArrayList<>();

    public Restaurant(String name) {
        this.name = name;
    }

    public void addOrder(OrderItem... orderItems) {
        this.orderItems.addAll(Arrays.asList(orderItems));
    }

    public int calculateIncome() {
        System.out.println(orderItems);
        return orderItems.stream().map(orderItem -> orderItem.calculatePrice()).reduce(0, (price1, price2) -> price1 + price2 );
    }

    @Override
    public String toString() {
        return "Restaurant{" +
                "name='" + name + '\'' +
                ", orderItems=" + orderItems +
                '}';
    }

    public static void main(String[] args) {
        Restaurant subway = new Restaurant("Subway");
        Drink drink = new Drink(Flavor.COCA_COLA);
        Ingredient ingredient1 = new Ingredient("Cheese", 100);
        Ingredient ingredient2 = new Ingredient("Meatball", 120);
        Sandwich sandwich = new Sandwich(ingredient1, ingredient2);
        subway.addOrder(drink, sandwich);

        System.out.println(subway);
        System.out.println("Income for today in Subway: " + subway.calculateIncome());
    }

}
