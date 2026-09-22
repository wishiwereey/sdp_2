package Factory;
public class Main {
    public static void main(String[] args){
        DrinkCreator creator;
        creator = new EspressoCreator();
        creator.serveDrink();
        creator = new LatteCreator();
        creator.serveDrink();
        creator = new CappuccinoCreator();
        creator.serveDrink();
    }
}
