import java.util.*;

public class Dijkstra {

    public Dijkstra(HashMap<String, HashMap<String, Integer>> graph,
                    HashMap<String, Integer> costs,
                    HashMap<String, String> parents) {

        HashSet<String> visited = new HashSet<>();
        String edge = findLowestEdge(costs, visited);
        while (true) {
            // the algorithm goes here.
            try {
                String edge = findLowestEdge(costs, visited);
            } catch (IllegalArgumentException e) {
                break;
            }
        }
    }

    public static String findLowestEdge(HashMap<String, Integer> vertex, HashSet<String> visited) {
        int min = Integer.MAX_VALUE;
        String minEntry;
        for (Map.Entry<String, Integer> entry : vertex.entrySet()) {
            if (!visited.contains(entry.getKey()) && entry.getValue() < min) {
                minEntry = entry.getKey();
                min = entry.getValue();
            }
        }
        if (minEntry == null) {
            throw new IllegalArgumentException("The input vertex map is empty.");
        }
        return minEntry;
    }

    public static void main(String[] args) {

        HashMap<String, HashMap<String, Integer>> graph = new HashMap<>();
        HashMap<String, Integer> costs = new HashMap<>();
        HashMap<String, String> parents = new HashMap<>();

        // Setting up the Graph
        HashMap<String, Integer> neighborsA = new HashMap<>();
        neighborsA.put("B", 5);
        neighborsA.put("C", 2);
        graph.put("A", neighborsA);

        HashMap<String, Integer> neighborsB = new HashMap<>();
        neighborsB.put("C", 8);
        neighborsB.put("E", 2);
        neighborsB.put("D", 4);
        graph.put("B", neighborsB);

        HashMap<String, Integer> neighborsC = new HashMap<>();
        neighborsC.put("B", 8);
        neighborsC.put("E", 7);
        neighborsC.put("A", 2);
        graph.put("C", neighborsC);

        HashMap<String, Integer> neighborsD = new HashMap<>();
        neighborsD.put("B", 4);
        neighborsD.put("E", 6);
        neighborsD.put("F", 2);
        graph.put("D", neighborsD);

        HashMap<String, Integer> neighborsE = new HashMap<>();
        neighborsE.put("B", 4);
        neighborsE.put("C", 7);
        neighborsE.put("D", 6);
        neighborsE.put("F", 1);
        graph.put("E", neighborsE);

        HashMap<String, Integer> neighborsF = new HashMap<>();
        neighborsF.put("D", 2);
        neighborsF.put("E", 1);
        graph.put("F", neighborsF);

        //set up the Cost Table
        costs.put("B", 5);
        costs.put("C", 2);
        costs.put("D", Integer.MAX_VALUE);
        costs.put("E", Integer.MAX_VALUE);
        costs.put("F", Integer.MAX_VALUE);

        // set up Parents
        parents.put("B", "A");
        parents.put("C", "A");
    }
}
