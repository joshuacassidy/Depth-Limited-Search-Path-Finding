public class DepthLimitedSearch {

    public Vertex search(Vertex start, Vertex goal, int depth) {
        if (start.getName().equals(goal.getName())) {
            return start;
        }
        if (depth > 0) {
            for (Vertex adjacency : start.getAdjacencies()) {
                Vertex found = search(adjacency, goal, depth - 1);
                if (found != null) {
                    return found;
                }
            }
        }
        return null;
    }

}