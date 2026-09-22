package Factory;
public abstract class DrinkCreator {
    public abstract Drink createDrink();
    public void serveDrink(){
        Drink drink = createDrink();
        System.out.println("Order received");
        drink.prepare();
        System.out.println("Drink is ready\n");
    }
}
