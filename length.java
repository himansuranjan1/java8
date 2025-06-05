import java.util.List;

import java.util.Arrays;

public class length {
    public static void main(String[]args){
    List<String>l=Arrays.asList("ANSU","rahul","kartik","kamal");
l.stream().forEach(i->System.out.print(i.length()));
}}
