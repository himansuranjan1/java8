import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

import java.util.stream.Collectors;
public class srtmpval {
    public static void main(String[] args) {
    
    Map<String, Integer> map = new HashMap<>();
        map.put("banana", 2);
        map.put("apple", 3);
        map.put("cherry", 2);
        map.put("date", 1);
        Map<String,Integer>m=map.entrySet().stream().sorted(
            (a,b)->{
            int v=b.getValue()-a.getValue();
            return v==0?a.getKey().compareTo(b.getKey()):v;
}).collect(Collectors.toMap(i->i.getKey(),j->j.getValue(),(a,b)->a,LinkedHashMap::new));
m.forEach((a,b)->System.out.print(a+" "+b));}}



    
