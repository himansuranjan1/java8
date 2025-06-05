//Second Highest Number

import java.util.Arrays;


import java.util.List;

class scndmax{
    public static void main(String[] args) {
        List<Integer> n = Arrays.asList(5, 1, 3, 9, 9, 7);
int x=n.stream().distinct().sorted((a,b)->Integer.compare(b,a)).skip(1).findFirst().orElse(-1);
System.out.println(x);

    
}}