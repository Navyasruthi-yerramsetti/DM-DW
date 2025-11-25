import java.util.*;

public class Main {
    public static void main(String[] args) {
        Set<String> dataset = new HashSet<>();
        
        dataset.add("ID1,20,80");
        dataset.add("ID1,25,75");
        dataset.add("ID1,30,65");
        dataset.add("ID1,22,70");
        
        System.out.println("Unique simulated Dataset:");
        for (String row : dataset) {
            System.out.println(row);
        }
    }
}
