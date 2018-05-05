import java.util.ArrayList;
import java.util.List;

public class Vertex {

    private String name;
    public List<Vertex> adjacencies;

    public Vertex(String name) {
        this.name = name;
        adjacencies = new ArrayList<>();
    }

    public void addNeighbour(Vertex vertex) {
        adjacencies.add(vertex);
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAdjacencies(List<Vertex> adjacencies) {
        this.adjacencies = adjacencies;
    }

    public String getName() {
        return name;
    }

    public List<Vertex> getAdjacencies() {
        return adjacencies;
    }

    @Override
    public String toString() {
        return name;
    }
}
