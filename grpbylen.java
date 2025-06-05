//11. Write a Java 8 program to group strings by their lengths and print the groups.

import java.util.Map;
import java.util.stream.Collectors;


import java.util.Arrays;
import java.util.List;


class grpbylen{
    public static void main (String[]args){
    List<String>l = Arrays.asList("a", "bb", "ccc", "dd");
    Map<Integer,Long>m=l.stream().collect(Collectors.groupingBy(i->i.length(),Collectors.counting()));
    m.forEach((a,b)->System.out.println(a+"length"+"  "+b));
}}



