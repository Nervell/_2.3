public class Truck extends Vehicle {

    public Truck(String modelName, int wheelsCount) {
        super(modelName, wheelsCount);
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
