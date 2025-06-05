import java.util.Arrays;
import java.util.List;

public class eveneight {
    public static void main(String[] args) {
      Integer a[]={2,4,5,7,8};
  List<Integer>b=Arrays.asList(a);
  b.stream().filter(n->n%2==0).forEach(i->System.out.print(i));
 
}}


