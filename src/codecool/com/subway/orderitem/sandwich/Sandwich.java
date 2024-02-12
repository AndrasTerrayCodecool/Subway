package codecool.com.subway.orderitem.sandwich;

import codecool.com.subway.orderitem.OrderItem;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Sandwich extends OrderItem {

    private List<Ingredient> ingredients = new ArrayList<>();

    public Sandwich() {
    }

    public Sandwich(Ingredient... ingredients) {
        this.ingredients.addAll(Arrays.asList(ingredients));
    }

    @Override
    public double calculatePrice() {
        return ingredients.stream().map(ingredient -> ingredient.getPrice()).reduce(0.0, (price1, price2) -> price1 + price2);
    }

    public void addIngredients(Ingredient... ingredients) {
        this.ingredients.addAll(Arrays.asList(ingredients));
    }

    @Override
    public String toString() {
        return "Sandwich{" +
                "ingredients=" + ingredients +
                '}';
    }
}
