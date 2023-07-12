public class Car extends Transport {
    public Car(String modelName, int wheelsCount) {
        super(modelName, wheelsCount);
    }
    @Override
    public void check() {
        if (getModelName() != null) {
            System.out.println(getModelName() + " is in the service");
            for (int i = 0; i < getWheelsCount(); i++) {
                updateCarTyre();
            }
            checkCarEngine();
        }
    }
    public void updateCarTyre() {
        System.out.println("Needs tires change");
    }

    public void checkCarEngine() {
        System.out.println("Checking engine");
    }
}
