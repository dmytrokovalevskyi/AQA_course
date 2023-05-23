import java.util.*;

public class Main {
    public static void main(String[] args) {
        // Task 1
        TreeSet<Integer> newSet = new TreeSet<>();
        newSet.add(3);
        System.out.println("Result for Task 1:");
        System.out.println(newSet);
        newSet.add(1);
        System.out.println(newSet);
        newSet.add(2);
        System.out.println(newSet);

        // Task 2
        HashMap<Integer, String> users = new HashMap<>();
        String[] userNames = {"Kolya", "Petya", "Vasya", "Stepan", "Kaban"};
        int j = 1;
        for (int i = 0; i < userNames.length; i++) {
            users.put(j,userNames[i]);
            j++;
        }
        System.out.println("Result for Task 2:");
        for(Map.Entry<Integer, String> entry: users.entrySet()) {
            if (entry.getKey() % 2 == 0) {
                System.out.println(entry.getValue());
            }
        }

        // Task 3
        HashSet<String> set = new HashSet<>();
        set.add("Olya");
        set.add("Natasha");
        set.add("Polina");
        set.add("Vlad");

        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("Bohdan");
        arrayList.add("Oleksandr");
        arrayList.add("Vlad");
        arrayList.add("Natasha");

        arrayList.addAll(set);
        System.out.println("Result for Task 3:");
        System.out.println(arrayList);

        // Task 4 test
        HashMap<String, String> testMap = new HashMap<>();
        testMap.put("123", "should be printed");
        testMap.put("1234", "should not be printed");
        testMap.put("owt", "should be printed");
        testMap.put("ow", "should not be printed");

        System.out.println("Result for Task 4:");
        System.out.println(megoMethod(testMap));

    }

    // Task 4 method
    private static HashMap<String, String> megoMethod(HashMap<String, String> map) {
        HashMap<String, String> sortedMap = new HashMap<>();
        for(Map.Entry<String, String> entry: map.entrySet()) {
            if (entry.getKey().length() == 3) {
                sortedMap.put(entry.getKey(), entry.getValue());
            }
        }
        return sortedMap;
    }
}