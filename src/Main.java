import java.util.HashMap;
import java.util.Map;

public class Main {
    protected static String text = "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut " +
            "labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi" +
            " ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse" +
            " cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non proident, sunt in culpa" +
            " qui officia deserunt mollit anim id est laborum.";
    private static final String textWithoutSpaces = text.replaceAll(" ", "");

    public static void main(String[] args) {

        int maxValue = 1;
        char maxKey = 0;
        int minValue = Integer.MAX_VALUE;
        char minKey = 0;

        Map<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < textWithoutSpaces.length(); i++) {
            if (!map.containsKey(textWithoutSpaces.charAt(i))) {
                map.put(textWithoutSpaces.charAt(i), 1);
            } else {
                int value = map.get(textWithoutSpaces.charAt(i));
                ++value;
                map.put(textWithoutSpaces.charAt(i), value);
            }
        }
        for (Map.Entry<Character, Integer> kv : map.entrySet()) {
            if (kv.getValue() > maxValue) {
                maxKey = kv.getKey();
                maxValue = kv.getValue();
            } else if (kv.getValue() < minValue) {
                minKey = kv.getKey();
                minValue = kv.getValue();
            }
        }
        System.out.println("Наибольшее количество символов - " + maxKey + " - " + maxValue);
        System.out.println("Наименьшее количество символов - " + minKey + " - " + minValue);
    }
}