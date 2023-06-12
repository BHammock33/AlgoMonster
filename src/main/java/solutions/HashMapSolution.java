package solutions;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;
import java.util.stream.Collectors;

class HashMapSolution {
    public static HashMap<Integer, Integer> getCounter(List<Integer> arr) {
        HashMap<Integer, Integer> counter = new HashMap<>();
        for (int num : arr) {
            if (counter.containsKey(num)) {
                counter.put(num, counter.get(num) + 1);
            } else {
                counter.put(num, 1);
            }
        }
        return counter;
    }

    public static List<String> splitWords(String s) {
        return s.isEmpty() ? List.of() : Arrays.asList(s.split(" "));
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> arr = splitWords(scanner.nextLine()).stream().map(Integer::parseInt).collect(Collectors.toList());
        scanner.close();
        HashMap<Integer, Integer> counter = getCounter(arr);
        Map<Integer, Integer> sortedCounter = new TreeMap<>(counter);
        for (int key : sortedCounter.keySet()) {
            System.out.println(key + " " + sortedCounter.get(key));
        }
    }
}