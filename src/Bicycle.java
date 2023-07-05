public class Bicycle extends Transport {

    public Bicycle(String modelName, int wheelsCount) {
        super(modelName, wheelsCount);
    }

    @Override
    public void check(Transport transport) {
        if (transport != null) {
            System.out.println(transport.getModelName() + " is in the service");
            for (int i = 0; i < transport.getWheelsCount(); i++) {
                ((Bicycle) transport).updateTyre();
            }
        }
    }
    public void updateTyre() {
        System.out.println("Needs tires change");
    }

}
