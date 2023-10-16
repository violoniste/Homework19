import java.util.*;

public class Main {
    public static void main(String[] args) {

        List<Integer> nums = new ArrayList<>(List.of(1, 1, 2, 3, 4, 4, 5, 5, 6, 7, 5, 4, 3, 2));
        List<String> strings = new ArrayList<>(List.of("один", "два","два", "три", "три", "три"));

        task1(nums);
        task2(nums);
        task3(strings);
        task4(strings);
    }

    static void task1(List<Integer> nums) {
        for (Integer n : nums) {
            if (n % 2 != 0)
                System.out.print(n + " ");
        }
        System.out.println();
    }

    static void task2(List<Integer> nums) {
        Set<Integer> set = new TreeSet<>();
        for (Integer n : nums) {
            if (n % 2 != 0)
                continue;

            set.add(n);
        }
        System.out.println(set);
    }

    static void task3(List<String> strings) {
        Set<String> set = new TreeSet<>(strings);
        System.out.println(set);
    }

    private static void task4(List<String> strings) {
        HashMap<String, Integer> map = new HashMap<>();
        for (String s : strings) {
            map.put(s, map.getOrDefault(s, 0) + 1);
        }
        System.out.println(map.values());
    }
}