// Write a Java 8 program to find and print the maximum value from a list.

import java.util.Arrays;


import java.util.List;
import java.util.Optional;

class maxvalue{
    public static void main(String[] args) {
    List<Integer>l=Arrays.asList(3,4,1,2);
    Optional<Integer>x=l.stream().max((a,b)->Integer.compare(a,b));
    x.ifPresent(System.out::print);
}}