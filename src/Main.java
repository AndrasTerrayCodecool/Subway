import codecool.com.subway.Restaurant;
import codecool.com.subway.orderitem.drink.Drink;
import codecool.com.subway.orderitem.drink.Flavor;
import codecool.com.subway.orderitem.sandwich.Ingredient;
import codecool.com.subway.orderitem.sandwich.Sandwich;

public class Main {
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