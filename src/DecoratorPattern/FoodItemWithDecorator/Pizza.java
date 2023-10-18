package DecoratorPattern.FoodItemWithDecorator;

public class Pizza implements IFoodItem{

    @Override
    public String getDescription() {
        return "Pizza";
    }

    @Override
    public Double getPrice() {
        return 200.00;
    }

}
