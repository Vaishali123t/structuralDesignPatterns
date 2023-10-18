package DecoratorPattern.FoodItemWithDecorator;

class Burger implements IFoodItem{

    @Override
    public String getDescription() {
        return "Burger";
    }

    @Override
    public Double getPrice() {
        return 120.00;
    }

}
