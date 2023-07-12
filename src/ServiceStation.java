public class ServiceStation implements ServiceStationInterface {
    @Override
    public void check(Transport transport) {
        transport.check(transport);
    }

}
