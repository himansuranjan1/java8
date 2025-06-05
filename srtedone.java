//Write a Java 8 program to find and print the first element in sorted order

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

class srtedone{
    public static void main(String[] args) {
     List<Integer>l= Arrays.asList(2,4,3,8,5);
   List<Integer> x=l.stream().sorted().limit(1).collect(Collectors.toList());
   System.out.println(x);
    }
}