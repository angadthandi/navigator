package modules.transport.walk;

import modules.location.Location;
import modules.pathnode.PathNode;
import modules.transport.ITransport;
import modules.transporttype.TransportType;

public class Walk implements ITransport {

    public PathNode buildPath(Location A, Location B) {
        PathNode node = new PathNode();

        System.out.printf("%s Path: %v", TransportType.WALK.getValue(), node);

        return node;
    }

}