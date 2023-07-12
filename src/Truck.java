public class Truck extends Transport {

    public Truck(String modelName, int wheelsCount) {
        super(modelName, wheelsCount);
    }

    @Override
    public void check() {
        if (getModelName() != null) {
            System.out.println(getModelName() + " is in the service");
            for (int i = 0; i < getWheelsCount(); i++) {
                updateTruckTyre();
            }
            checkTruckEngine();
            checkTruckTrailer();
        }
    }
    public void updateTruckTyre() {
        System.out.println("Needs tires change");
    }

    public void checkTruckEngine() {
        System.out.println("Checking engine");
    }

    public void checkTruckTrailer() {
        System.out.println("Checking trailer");
    }

}
