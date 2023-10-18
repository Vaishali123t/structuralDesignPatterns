package DecoratorPattern.FoodItemWithDecorator;

public class SauceDecoratedFoodItem extends FoodItemDecorator{

    private double extraSaucePrice;

    SauceDecoratedFoodItem(IFoodItem item, Double price){
        super(item);
        this.extraSaucePrice= price;
    }

    @Override
    public String getDescription() {
        return foodItem.getDescription()+ " with extra sauce";
    }

    @Override
    public Double getPrice() {
        return foodItem.getPrice()+extraSaucePrice;
    }
}
