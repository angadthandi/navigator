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
        transport = _setTransport(transportType);
    }

    public PathNode getPath(Location A, Location B) {
        PathNode node = new PathNode();

        node = transport.buildPath(A, B);

        return node;
    }

    private ITransport _setTransport(TransportType transportType) {
        ITransport t = new Walk();

        switch (transportType) {
            case WALK:
                t = new Walk();
            break;
            case CAR:
                t = new Car();
            break;
            case BUS:
                t = new Bus();
            break;
            case BIKE:
                t = new Bike();
            break;
        }

        return t;
    }

}