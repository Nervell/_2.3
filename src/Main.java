import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ServiceStation station = new ServiceStation();

        ArrayList<Transport> transports = new ArrayList<>();
        transports.add(new Car("car1", 4));
        transports.add(new Car("car2", 4));
        transports.add(new Truck("truck1", 6));
        transports.add(new Truck("truck2", 6));
        transports.add(new Bicycle("bicycle1", 2));
        transports.add(new Bicycle("bicycle2", 2));

        printReport(transports, station);
    }

    private static void printReport(ArrayList<Transport> transports, ServiceStation station) {
        for (Transport transport : transports) {
            station.check(transport);
        }
    }
}