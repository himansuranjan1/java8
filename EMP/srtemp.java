import java.util.ArrayList;
import java.util.List;

public class srtemp {
public static void main(String[] args) {
  
   List<Empsal>l=new ArrayList<>();
      l.add(new Empsal(30000, "ansu"));
        l.add(new Empsal(20000, "money"));
        l.add(new Empsal(10000, "silu"));
        l.add(new Empsal(30000, "anil"));
l.stream().sorted(((a,b)->{
    Double val=b.sal-a.sal;
    return val==0?a.name.compareTo(b.name) :Double.compare(b.sal,a.sal);})).forEach(i->System.out.print(i.name+" "));

}}