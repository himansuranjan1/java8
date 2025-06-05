//Numbers Starting With 1

import java.util.Arrays;
import java.util.List;

class startone{
    public static void main(String[] args) {
List<Integer> n = Arrays.asList(10, 12, 25, 19);
n.stream().map(String::valueOf).filter(s->s.startsWith("1")).map(Integer::valueOf).forEach(i->System.out.print(i+" ")); 
    
}}





