package AbstractFactory;
public interface ServingSetFactory {
    Cup createCup();
    Lid createLid();
    Receipt createReceipt();
}
