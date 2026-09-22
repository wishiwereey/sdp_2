package Factory;
public class Latte implements Drink{
    @Override
    public void prepare() {
        System.out.println("Preparing latte, smooth coffee with warm milk");
    }
}
