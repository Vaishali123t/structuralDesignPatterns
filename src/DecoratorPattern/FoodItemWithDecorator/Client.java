package DecoratorPattern.FoodItemWithDecorator;

public class Client {

    public static void main(String args[]){
        IFoodItem pizza= new Pizza();
        IFoodItem burger= new Burger();

        pizza= new SauceDecoratedFoodItem(pizza,30.0);
        System.out.println(pizza.getDescription());
        System.out.println(pizza.getPrice());

        burger= new CheeseDecoratedFoodItem(burger,40.0);
        burger= new SauceDecoratedFoodItem(burger,10.0);
        System.out.println(burger.getDescription());
        System.out.println(burger.getPrice());
    }

}
