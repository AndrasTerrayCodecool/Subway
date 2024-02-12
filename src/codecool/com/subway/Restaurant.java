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

}
