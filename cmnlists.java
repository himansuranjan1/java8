import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

class cmnlists{
    public static void main(String[] args) {
   List<Integer> a = Arrays.asList(1, 2, 3, 4);
List<Integer> b = Arrays.asList(3, 4, 5, 6);
a.stream().filter(i->b.contains(i)).collect(Collectors.toList()).forEach(i->System.out.println(i));

    }
}