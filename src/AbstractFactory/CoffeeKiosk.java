package AbstractFactory;
public class CoffeeKiosk {
    private final Cup cup;
    private final Lid lid;
    private final Receipt receipt;
    public CoffeeKiosk(ServingSetFactory factory) {
        cup = factory.createCup();
        lid = factory.createLid();
        receipt = factory.createReceipt();
    }
    public void serveOrder() {
        cup.use();
        lid.cover();
        receipt.print();
        System.out.println("Order is ready!\n");
    }
}
