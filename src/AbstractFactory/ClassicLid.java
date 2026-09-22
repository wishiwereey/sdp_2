package AbstractFactory;
public class ClassicLid implements Lid {
    @Override
    public void cover() {
        System.out.println("Classic lid is placed on the cup");
    }
}
