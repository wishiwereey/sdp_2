package AbstractFactory;
public class EcoReceipt implements Receipt {
    @Override
    public void print(){
        System.out.println("Eco receipt is printed");
    }
}
