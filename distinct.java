//Write a Java 8 program to print distinct elements from a list of integers.

import java.util.Arrays;
import java.util.List;

class distinct {
public static void main(String[] args) {
    List<Integer>l=Arrays.asList(2,4,5,6,6,4);
    l.stream().distinct().forEach(System.out::print);
    
}
    
}