import java.util.LinkedHashMap;
import java.util.stream.Collectors;

public class firstnonrpt {
    public static void main(String[] args) {
        String s="swiss";
Character ch=s.chars()
             .mapToObj(i->(char)i)
             .collect(Collectors.groupingBy(i->i,LinkedHashMap::new,Collectors.counting()))
             .entrySet().stream().filter(i->i.getValue()==1)
             .map(i->i.getKey()).findFirst().orElse(null);

System.out.println(ch);
    }
}





