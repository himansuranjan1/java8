// Write a Java 8 program to print names sorted in alphabetical order from a list

import java.util.Arrays;
import java.util.List;

public class srted {

    public static void main(String[] args) {
        List<String>l=Arrays.asList("ansu","rahul","kamal","kishan");
        l.stream().sorted().forEach(i->System.out.print(i+" "));
    }
}