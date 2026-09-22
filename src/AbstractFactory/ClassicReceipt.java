package AbstractFactory;
public class ClassicReceipt implements Receipt{
    @Override
    public void print(){
        System.out.println("Classic receipt is printed");
    }
}
