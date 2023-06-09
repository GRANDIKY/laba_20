
public class AirFactory extends LogisticFactory {

    @Override
    public Logistic createLogistic() {
        return new Airplane();
    }
}


class Airplane implements Logistic{

    @Override
    public void transit() {
        System.out.println("Груз перемещается по воздуху самолётом");
    }
}
