import java.util.ArrayList;
import java.util.List;
import java.util.OptionalDouble;
import java.util.Random;

public class Main {
    public static void main(String[] args) {

        List<Integer> list = creatListWithRandomNumbers(10, 1, 5);

        OptionalDouble average = list.stream().mapToInt(e -> e).average();

        System.out.println(list);

        System.out.println(average);

    }

    public static List<Integer> creatListWithRandomNumbers (int size, int minNum, int maxNum) {
        List<Integer> list = new ArrayList<>();
        Random rnd = new Random();
        for (int i = 0; i < size; i++) {
            list.add(rnd.nextInt(maxNum - minNum + 1) + minNum);
        }
        return list;
    }
}