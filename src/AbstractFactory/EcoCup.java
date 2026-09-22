package AbstractFactory;
public class EcoCup implements Cup {
    @Override
    public void use() {
        System.out.println("Eco-friendly cup is ready");
    }
}
