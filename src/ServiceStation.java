public class ServiceStation implements ServiceStationInterface {
    @Override
    public void check(Truck truck) {
        if (truck != null) {
            System.out.println(truck.getModelName() + " is in the service");
            for (int i = 0; i < truck.getWheelsCount(); i++) {
                truck.updateTyre();
            }
            truck.checkEngine();
            truck.checkTrailer();
        }
    }
    @Override
    public void check(Car car) {
        if (car != null) {
            System.out.println(car.getModelName() + " is in the service");
            for (int i = 0; i < car.getWheelsCount(); i++) {
                car.updateTyre();
            }
            car.checkEngine();
        }
    }
    @Override
    public void check(Bicycle bicycle) {
        if (bicycle != null) {
            System.out.println(bicycle.getModelName() + " is in the service");
            for (int i = 0; i < bicycle.getWheelsCount(); i++) {
                bicycle.updateTyre();
            }
        }
    }

}
