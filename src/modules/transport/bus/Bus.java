package modules.transport.bus;

import modules.location.Location;
import modules.pathnode.PathNode;
import modules.transport.ITransport;
import modules.transporttype.TransportType;

public class Bus implements ITransport {

    public PathNode buildPath(Location A, Location B) {
        PathNode node = new PathNode();

        System.out.printf("%s Path: %v", TransportType.BUS.getValue(), node);

        return node;
    }

}