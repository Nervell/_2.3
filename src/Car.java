public class Car extends Transport {
    public Car(String modelName, int wheelsCount) {
        super(modelName, wheelsCount);
    }
    @Override
    public void check(Transport transport) {
        if (transport != null) {
            System.out.println(transport.getModelName() + " is in the service");
            for (int i = 0; i < transport.getWheelsCount(); i++) {
                ((Car) transport).updateTyre();
            }
            ((Car) transport).checkEngine();
        }
    }
    public void updateTyre() {
        System.out.println("Needs tires change");
    }

    public void checkEngine() {
        System.out.println("Checking engine");
    }
}
