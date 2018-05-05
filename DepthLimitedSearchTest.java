import org.junit.Before;

import java.util.ArrayList;

import static org.junit.Assert.*;

public class DepthLimitedSearchTest {

    private DepthLimitedSearch depthLimitedSearch;
    private ArrayList<Vertex> vertices;

    @Before
    public void setUp() throws Exception {
        depthLimitedSearch = new DepthLimitedSearch();
        vertices = new ArrayList<>();
        for (int i = 'a'; i <= 'j'; i++) {
            vertices.add(new Vertex(""+(char) i));
        }
        vertices.get(0).addNeighbour(vertices.get(1));
        vertices.get(0).addNeighbour(vertices.get(2));
        vertices.get(1).addNeighbour(vertices.get(3));
        vertices.get(1).addNeighbour(vertices.get(0));
        vertices.get(1).addNeighbour(vertices.get(4));
        vertices.get(2).addNeighbour(vertices.get(5));
        vertices.get(2).addNeighbour(vertices.get(6));
    }

    @org.junit.Test
    public void searchCase1() throws Exception {
        Vertex found = depthLimitedSearch.search(vertices.get(0), vertices.get(5), 2);
        assertEquals(found.getName(), "f");
    }

    @org.junit.Test
    public void searchCase2() throws Exception {
        Vertex found = depthLimitedSearch.search(vertices.get(0), vertices.get(5), 1);
        assertEquals(found, null);
    }

}