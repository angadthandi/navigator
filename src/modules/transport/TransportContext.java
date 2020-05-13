package modules.transport;

import modules.location.Location;
import modules.pathnode.PathNode;

public class TransportContext {
    private ITransport transport;

    public TransportContext(ITransport t) {
        transport = t;
    }

    public PathNode buildPath(Location A, Location B) {
        PathNode node = new PathNode();

        node = transport.buildPath(A, B);

        return node;
    }

}