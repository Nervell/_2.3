public class Truck extends Transport {

    public Truck(String modelName, int wheelsCount) {
        super(modelName, wheelsCount);
    }

    @Override
    public void check(Transport transport) {
        if (transport != null) {
            System.out.println(transport.getModelName() + " is in the service");
            for (int i = 0; i < transport.getWheelsCount(); i++) {
                ((Truck) transport).updateTyre();
            }
            ((Truck) transport).checkEngine();
            ((Truck) transport).checkTrailer();
        }
    }
    public void updateTyre() {
        System.out.println("Needs tires change");
    }

    public void checkEngine() {
        System.out.println("Checking engine");
    }

    public void checkTrailer() {
        System.out.println("Checking trailer");
    }

}
