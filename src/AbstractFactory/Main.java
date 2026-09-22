package AbstractFactory;
public class Main {
    public static void main(String[] args) {
        ServingSetFactory factory = new ClassicServingSetFactory();
        CoffeeKiosk kiosk = new CoffeeKiosk(factory);
        kiosk.serveOrder();
    }
}
