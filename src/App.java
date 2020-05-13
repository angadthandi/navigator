import modules.location.Location;
import modules.navigator.Navigator;
import modules.transporttype.TransportType;

public class App {
    public static void main(String[] args) throws Exception {
        Location A = new Location();
        A.latitude = 1.00000;
        A.longitude = 2.00000;

        Location B = new Location();
        B.latitude = 3.00000;
        B.longitude = 4.00000;

        Navigator navigator = new Navigator(TransportType.WALK);
        navigator.getPath(A, B);

        navigator.setTransport(TransportType.CAR);
        navigator.getPath(A, B);

        navigator.setTransport(TransportType.BUS);
        navigator.getPath(A, B);

        navigator.setTransport(TransportType.BIKE);
        navigator.getPath(A, B);
    }
}
