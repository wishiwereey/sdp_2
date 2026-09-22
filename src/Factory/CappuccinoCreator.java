package Factory;
public class CappuccinoCreator extends DrinkCreator {
    @Override
    public Drink createDrink(){
        return new Cappuccino();
    }
}
