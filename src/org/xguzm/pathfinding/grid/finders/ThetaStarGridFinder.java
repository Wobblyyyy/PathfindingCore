package org.xguzm.pathfinding.grid.finders;

import org.xguzm.pathfinding.finders.ThetaStarFinder;
import org.xguzm.pathfinding.grid.NavigationGridGraph;
import org.xguzm.pathfinding.grid.NavigationGridGraphNode;

import java.util.List;

/**
 * A helper class to which lets you find a path based on coordinates rather than nodes on {@link NavigationGridGraph}'s.
 *
 * @param <T> any class that implements from {@link NavigationGridGraphNode}
 * @author Xavier Guzman
 */
public class ThetaStarGridFinder<T extends NavigationGridGraphNode> extends ThetaStarFinder<T> {

    public ThetaStarGridFinder(Class<T> clazz) {
        this(clazz, new GridFinderOptions());
    }

    public ThetaStarGridFinder(Class<T> clazz, GridFinderOptions opt) {
        super(clazz, opt);
    }

    public List<T> findPath(int startX, int startY, int endX, int endY, NavigationGridGraph<T> grid) {
        return findPath(grid.getCell(startX, startY), grid.getCell(endX, endY), grid);
    }

}