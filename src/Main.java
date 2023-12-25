import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String model = in.nextLine();
        Map<Character, Integer> charFrequencyMap = new HashMap<>();
        for (char ch : model.toCharArray()) {
            charFrequencyMap.put(ch, charFrequencyMap.getOrDefault(ch, 0) + 1);
        }
        for (Map.Entry<Character, Integer> entry : charFrequencyMap.entrySet()) {
            System.out.println("'" + entry.getKey() + "' occurs " + entry.getValue() + " times");
        }
    }
}
