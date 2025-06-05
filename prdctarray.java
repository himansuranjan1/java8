//product array
    import java.util.Arrays;
import java.util.List;

class productarray{
    public static void main(String[] args) {
     List<Integer>l= Arrays.asList(2,4,3,8,5);
 Integer k = l.stream().reduce(1,(a,b)->a*b);
 System.out.println(k);
}}