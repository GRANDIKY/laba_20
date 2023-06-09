
public class BoatFactory extends LogisticFactory {

    @Override
    public Logistic createLogistic() {
        return new Boat();
    }
}

class Boat implements Logistic{

    @Override
    public void transit() {
        System.out.println("Груз перемещается по воде судном");
    }
}



