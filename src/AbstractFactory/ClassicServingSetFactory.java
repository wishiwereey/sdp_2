package AbstractFactory;
public class ClassicServingSetFactory implements ServingSetFactory {
    @Override
    public Cup createCup() {
        return new ClassicCup();
    }
    @Override
    public Lid createLid() {
        return new ClassicLid();
    }
    @Override
    public Receipt createReceipt() {
        return new ClassicReceipt();
    }
}
