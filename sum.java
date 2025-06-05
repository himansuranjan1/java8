//Write a Java 8 program to reduce a list of integers to their sum

import java.util.Arrays;
import java.util.List;

public class sum {
   public static void main(String[] args) {

    List<Integer>l=Arrays.asList(2,3,4,5);
    int x=l.stream().mapToInt(i->i).sum();
    System.out.println(x);
   } 
}
