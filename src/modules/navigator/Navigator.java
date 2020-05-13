package modules.navigator;

import modules.location.Location;
import modules.pathnode.PathNode;
import modules.transport.ITransport;
import modules.transport.bike.Bike;
import modules.transport.bus.Bus;
import modules.transport.car.Car;
import modules.transport.walk.Walk;
import modules.transporttype.TransportType;

public class Navigator implements INavigator {
    private ITransport transport;

    public Navigator(TransportType transportType) {
        setTransport(transportType);
    }

    public PathNode getPath(Location A, Location B) {
        PathNode node = new PathNode();

        node = transport.buildPath(A, B);

        return node;
    }

    public void setTransport(TransportType transportType) {
        switch (transportType) {
            case WALK:
                transport = new Walk();
            break;
            case CAR:
                transport = new Car();
            break;
            case BUS:
                transport = new Bus();
            break;
            case BIKE:
                transport = new Bike();
            break;
        }
    }

}