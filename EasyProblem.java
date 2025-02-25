import java.util.*;

public class AutoBoxingExample {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();
        numbers.add(Integer.valueOf(10));
        numbers.add(20);

        int sum = 0;
        for (Integer num : numbers) {
            sum += num;
        }
        System.out.println("Sum: " + sum);

        String str = "30";
        int parsedNum = Integer.parseInt(str);
        System.out.println("Parsed Number: " + parsedNum);
    }
}
