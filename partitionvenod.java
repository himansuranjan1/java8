import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class partitionvenod {
    public static void main(String[] args) {
        List<Integer> n = Arrays.asList(1, 2, 3, 4, 5);
     Map<Boolean,List<Integer>>m=n.stream().collect(Collectors.partitioningBy(i->i%2==0));
     System.out.println(m);
    }
}
