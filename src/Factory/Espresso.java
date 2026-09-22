package Factory;
public class Espresso implements Drink{
    @Override
    public void prepare() {
        System.out.println("Preparing espresso, strong coffee with no milk");
    }
}
