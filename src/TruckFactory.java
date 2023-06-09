
public class TruckFactory extends LogisticFactory {

    @Override
    public Logistic createLogistic() {
        return new Truck();
    }

}

class Truck implements Logistic{

    @Override
    public void transit() {
        System.out.println("Груз перемещается по дороге грузовиком");
    }
}

