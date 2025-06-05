
//Write a Java 8 program to map integers to their squares and print results.

import java.util.Arrays;
import java.util.List;

public class square {
    public static void main(String[] args) {
        
List<Integer>l=Arrays.asList(2,4,3,5,7);
l.stream().map(i->i*i).forEach(i->System.out.print(i+" "));

    }
}
