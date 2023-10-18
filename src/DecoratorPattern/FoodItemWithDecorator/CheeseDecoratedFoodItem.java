package DecoratorPattern.FoodItemWithDecorator;

class CheeseDecoratedFoodItem extends FoodItemDecorator{

    private double extraCheesePrice;

    CheeseDecoratedFoodItem(IFoodItem item,double price) {
        super(item);
        this.extraCheesePrice= price;
    }


    @Override
    public String getDescription() {
        return foodItem.getDescription() + " with Extra Cheese";
    }

    @Override
    public Double getPrice() {
        return foodItem.getPrice() + extraCheesePrice;
    }
}
