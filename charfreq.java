import java.util.Map;
import java.util.stream.Collectors;

public class charfreq {
    public static void main(String[] args) {
        String s = "banana";
        Map<Character,Long>m=s.chars()
                                .mapToObj(i->(char)i)
                                .collect(Collectors.groupingBy(i->i,Collectors.counting()));
                                
         System.out.print(m); 
         
    
    }
}
