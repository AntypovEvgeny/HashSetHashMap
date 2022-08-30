import java.util.HashMap;
import java.util.Map;

public class Main {
    protected static String text = "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut " +
            "labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi" +
            " ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse" +
            " cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non proident, sunt in culpa" +
            " qui officia deserunt mollit anim id est laborum.";

    public static void main(String[] args) {
        int maxValue = 1;
        int minValue = Integer.MAX_VALUE;
        Map<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < text.length(); i++) {
            if (!map.containsKey(text.charAt(i))) {
                map.put(text.charAt(i), 1);
            } else {
                int value = map.get(text.charAt(i));
                ++value;
                map.put(text.charAt(i), value);
            }

        }
        for (Map.Entry<Character, Integer> kv : map.entrySet()) {
            if (kv.getValue() > maxValue) {
                maxValue = kv.getValue();
                System.out.println("Наибольшее количество знаков - " + kv.getKey() + " - " + maxValue);
            }
            else if (kv.getValue() < minValue) {
                minValue = kv.getValue();
                System.out.println("Наименьшее количество символов - " + kv.getKey() + " - " + minValue);
            }
        }
    }
}