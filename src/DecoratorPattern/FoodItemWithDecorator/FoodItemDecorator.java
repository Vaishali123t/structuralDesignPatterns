package DecoratorPattern.FoodItemWithDecorator;

// Decorator interface
abstract class FoodItemDecorator implements IFoodItem{

    protected IFoodItem foodItem;

    FoodItemDecorator(IFoodItem item) {
        this.foodItem = item;
    }

}
