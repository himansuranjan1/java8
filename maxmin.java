import java.util.Arrays;
import java.util.List;

public class maxmin {
    public static void main(String[]args){
        List<Integer> nums = Arrays.asList(4, 1, 8, 3);
       int mx= nums.stream().max((a,b)->Integer.compare(a,b)).orElse(-1);
       int mn=nums.stream().min((a,b)->Integer.compare(a,b)).orElse(-1);
       System.out.println(mx+" "+mn);

    }
}



