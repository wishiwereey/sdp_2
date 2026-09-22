package AbstractFactory;
public class EcoServingSetFactory implements ServingSetFactory {
    @Override
    public Cup createCup() {
        return new EcoCup();
    }
    @Override
    public Lid createLid() {
        return new EcoLid();
    }
    @Override
    public Receipt createReceipt() {
        return new EcoReceipt();
    }
}
