package AbstractFactory;
public class EcoLid implements Lid {
    @Override
    public void cover(){
        System.out.println("Eco-friendly lid is placed on the cup");
    }
}
