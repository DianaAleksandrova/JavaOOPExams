package bakery.entities.bakedFoods.interfaces;

public class Cake extends BaseFood{
    private static final double InitialBreadPortion = 245;
    public Cake(String name, double price) {
        super(name, InitialBreadPortion, price);
    }
}
