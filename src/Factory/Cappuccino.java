package Factory;
public class Cappuccino implements Drink {
    @Override
    public void prepare() {
        System.out.println("Preparing cappuccino, creamy coffee with milk foam");
    }
}
