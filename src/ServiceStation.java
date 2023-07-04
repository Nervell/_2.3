public class ServiceStation implements ServiceStationInterface {
    @Override
    public void check(Transport transport) {
        if (transport.getClass().equals(Car.class)) {
            if (transport != null) {
                System.out.println(transport.getModelName() + " is in the service");
                for (int i = 0; i < transport.getWheelsCount(); i++) {
                    ((Car) transport).updateTyre();
                }
                ((Car) transport).checkEngine();
            }
        } else if (transport.getClass().equals(Bicycle.class)) {
            if (transport != null) {
                System.out.println(transport.getModelName() + " is in the service");
                for (int i = 0; i < transport.getWheelsCount(); i++) {
                    ((Bicycle) transport).updateTyre();
                }
            }
        } else if (transport.getClass().equals(Truck.class)) {
            if (transport != null) {
                System.out.println(transport.getModelName() + " is in the service");
                for (int i = 0; i < transport.getWheelsCount(); i++) {
                    ((Truck) transport).updateTyre();
                }
                ((Truck) transport).checkEngine();
                ((Truck) transport).checkTrailer();
            }
        }
    }

}
