import java.util.*;

public class RadioCoverage {

    // Set of all states needed (using 2-letter abbreviations)
    private static HashSet<String> statesNeeded = new HashSet<>(Arrays.asList(
            "AL", "AK", "AZ", "AR", "CA", "CO", "CT", "DE", "FL", "GA",
            "HI", "ID", "IL", "IN", "IA", "KS", "KY", "LA", "ME", "MD",
            "MA", "MI", "MN", "MS", "MO", "MT", "NE", "NV", "NH", "NJ",
            "NM", "NY", "NC", "ND", "OH", "OK", "OR", "PA", "RI", "SC",
            "SD", "TN", "TX", "UT", "VT", "VA", "WA", "WV", "WI", "WY"
    ));

    // Map of stations and the states they cover
    private static HashMap<String, HashSet<String>> stations = new HashMap<>();

    // Set of final stations to use
    private static HashSet<String> finalStations = new HashSet<>();

    public static void main(String[] args) {
        // Original 5 stations
        stations.put("kone", new HashSet<>(Arrays.asList("ID", "NV", "UT", "CA")));
        stations.put("ktwo", new HashSet<>(Arrays.asList("WA", "ID", "MT")));
        stations.put("kthree", new HashSet<>(Arrays.asList("CA", "NV", "AZ")));
        stations.put("kfour", new HashSet<>(Arrays.asList("AZ","TX", "OK", "AR", "LA")));
        stations.put("kfive", new HashSet<>(Arrays.asList("NY", "NJ", "CT")));
        
        stations.put("ksix", new HashSet<>(Arrays.asList("FL", "GA", "SC")));
        stations.put("kseven", new HashSet<>(Arrays.asList("IL", "IN", "IA")));
        stations.put("keight", new HashSet<>(Arrays.asList("CO", "NE", "WY")));
        stations.put("knine", new HashSet<>(Arrays.asList("MA", "RI", "VT", "NH")));
        stations.put("kten", new HashSet<>(Arrays.asList("ND", "SD", "MN", "WI")));

        // Ready for greedy logic
    }
}
