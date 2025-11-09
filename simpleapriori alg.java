import java.util.*;
public class SimpleApriori {
public static void main(String[] args) {
List<List<String>> transactions = List.of(
List.of("milk", "bread"),
List.of("bread", "butter"),
List.of("milk", "bread", "butter"),
List.of("bread")
);
int minSupport = 2;
Map<String, Integer> itemCount = new HashMap<>();
// Count items
for (List<String> transaction : transactions) {
for (String item : transaction) {
itemCount.put(item, itemCount.getOrDefault(item, 0) + 1);
}
}
// Print frequent items
System.out.println("Frequent Items:");
for (Map.Entry<String, Integer> entry : itemCount.entrySet()) {
if (entry.getValue() >= minSupport) {
System.out.println(entry.getKey() + ": " + entry.getValue());
}
}
}
}
