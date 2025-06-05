/*List<String> names = Arrays.asList("John", "Bob", "John", "Alice", "Bob");*/

import java.util.stream.Collectors;
import java.util.Arrays;
import java.util.List;
import java.util.Set;

class duplicates{
    public static void main(String[]args){
        List<String> names = Arrays.asList("John", "Bob", "John", "Alice", "Bob");
       Set<String>s= names.stream()
        .collect(Collectors.groupingBy(i->i,Collectors.counting()))
        .entrySet()
        .stream()
        .filter(i->i.getValue()>1)
        .map(i->i.getKey())
        .collect(Collectors.toSet());
        System.out.print(s);
    }
}




