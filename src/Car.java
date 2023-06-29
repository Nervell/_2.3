public class Car extends  Vehicle {
    public Car(String modelName, int wheelsCount) {
        super(modelName, wheelsCount);
    }

    public void updateTyre() {
        System.out.println("Needs tires change");
    }

    public void checkEngine() {
        System.out.println("Checking engine");
    }
}
