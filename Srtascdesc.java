import java.util.Arrays;
import java.util.List;

public class Srtascdesc {
    public static void main(String[] args) {
        List<Integer> nums = Arrays.asList(4, 1, 3);
        nums.stream().sorted().forEach(System.out::print);
        nums.stream().sorted((a,b)->Integer.compare(b,a)).forEach(System.out::print);
    }
}
