package Factory;
public class LatteCreator extends DrinkCreator {
    @Override
    public Drink createDrink() {
        return new Latte();
    }
}
