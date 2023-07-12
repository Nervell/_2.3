public class Bicycle extends Transport {

    public Bicycle(String modelName, int wheelsCount) {
        super(modelName, wheelsCount);
    }

    @Override
    public void check() {
        if (getModelName() != null) {
            System.out.println(getModelName() + " is in the service");
            for (int i = 0; i < getWheelsCount(); i++) {
                updateBicycleTyre();
            }
        }
    }
    public void updateBicycleTyre() {
        System.out.println("Needs tires change");
    }

}
