package modules.transport;

import modules.location.Location;
import modules.pathnode.PathNode;

public interface ITransport {
    PathNode buildPath(Location A, Location B);
}