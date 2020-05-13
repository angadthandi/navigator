package modules.transport.bike;

import modules.location.Location;
import modules.pathnode.PathNode;
import modules.transport.ITransport;
import modules.transporttype.TransportType;

public class Bike implements ITransport {

    public PathNode buildPath(Location A, Location B) {
        PathNode node = new PathNode();

        PathNode node1 = new PathNode();
        node1.location = A;
        PathNode node2 = new PathNode();
        node2.location = B;

        System.out.printf(
            "%s Path Latitude A: %f; Longitude A: %f;" +
            " Latitude B: %f; Longitude B: %f \n",
            TransportType.BIKE.getValue(),
            node1.location.latitude,
            node1.location.longitude,
            node2.location.latitude,
            node2.location.longitude
        );

        return node;
    }

}