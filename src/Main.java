public class Main {

    public static void main(String[] args) {
        TruckFactory truckFactory = new TruckFactory();
        Logistic truck = truckFactory.createLogistic();
        truck.transit();

        BoatFactory boatFactory = new BoatFactory();
        Logistic boat = boatFactory.createLogistic();
        boat.transit();

        AirFactory airFactory = new AirFactory();
        Logistic airplane = airFactory.createLogistic();
        airplane.transit();
    }
}
