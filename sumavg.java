/*List<Integer> list = Arrays.asList(4, 2, 6);
int sum = list.stream().mapToInt(i -> i).sum();
double avg = list.stream().mapToInt(i -> i).average().orElse(0);
System.out.println("Sum: " + sum + ", Avg: " + avg); // Sum: 12, Avg: 4.0
*/

import java.util.List;


import java.util.Arrays;

class sumavg{
    public static void main(String[]args){
      List<Integer> l = Arrays.asList(4, 2, 6);  
      int sum=l.stream(). mapToInt(i->i).sum();
      double avg=l.stream(). mapToInt(i->i).average().orElse(0);
      System.out.print(sum+" "+avg);
    }
}