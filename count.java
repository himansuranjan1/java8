// Write a Java 8 program to count and print the number of elements in a list.

import java.util.Arrays;
import java.util.List;


class count{
    public static void main(String[] args) {
        List<Integer>l=Arrays.asList(2,4,5,1,8,9);
       long c= l.stream().count();
System.out.println(c);
    }
}