import java.util.*;

public class Dijkstra {

    public Dijkstra(HashMap<String, HashMap<String, Integer>> graph, String start, String finish) {

        // Creating a Cost Table and a Parent Table
        HashMap<String, Integer> costs = new HashMap<>();
        HashMap<String, String> parents = new HashMap<>();

        for (Map.Entry<String, HashMap<String, Integer>> entry : graph.entrySet()) {
            costs.put(entry.getKey(), Integer.MAX_VALUE);
        }

        for (Map.Entry<String, Integer> entry : graph.get(start).entrySet()) {
            costs.put(entry.getKey(), entry.getValue());
            parents.put(entry.getKey(), start);
        }
        costs.put(start, 0);
        // Finding The Fastest Path
        HashSet<String> visited = new HashSet<>();
        String edge = findLowestEdge(costs, visited);
        while (edge != null) {

            int cost = costs.get(edge);
            for (Map.Entry<String, Integer> entry : graph.get(edge).entrySet()) {
                String tempVertex = entry.getKey();
                int tempWeight = entry.getValue();
                int sumWeight = cost + tempWeight;

                if (costs.get(tempVertex) > sumWeight) {
                    costs.put(tempVertex, sumWeight);
                    parents.put(tempVertex, edge);
                }
            }
            visited.add(edge);
            edge = findLowestEdge(costs, visited);
        }

        List<String> path = new ArrayList<>();
        String traverser = finish;
        while (traverser != null) {
            path.add(traverser);
            traverser = parents.get(traverser);
        }
        Collections.reverse(path);
        System.out.printf("The path is '%s' and its weight is %d.\n", String.join(" -> ", path), costs.get(finish));
    }


    public static String pathCreator(String s) {
        StringBuilder res = new StringBuilder();
        for (int i = s.length() - 1; i > -1; i--) {
            res.append(s.charAt(i));
            if (i != 0) {
                res.append(" -> ");
            }
        }
        return res.toString();
    }

    public static String findLowestEdge(HashMap<String, Integer> vertex, HashSet<String> visited) {
        int min = Integer.MAX_VALUE;
        String minEntry = null;
        for (Map.Entry<String, Integer> entry : vertex.entrySet()) {
            if (!visited.contains(entry.getKey()) && entry.getValue() < min) {
                minEntry = entry.getKey();
                min = entry.getValue();
            }
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
        neighborsB.put("A", 5);
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
        neighborsE.put("B", 2);
        neighborsE.put("C", 7);
        neighborsE.put("D", 6);
        neighborsE.put("F", 1);
        graph.put("E", neighborsE);

        HashMap<String, Integer> neighborsF = new HashMap<>();
        neighborsF.put("D", 2);
        neighborsF.put("E", 1);
        graph.put("F", neighborsF);

        new Dijkstra(graph, "A", "D");
    }
}
