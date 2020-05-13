package modules.navigator;

import modules.location.Location;
import modules.pathnode.PathNode;

public interface INavigator {
    PathNode getPath(Location A, Location B);
}