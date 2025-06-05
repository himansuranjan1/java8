/*List<String> list = Arrays.asList("hi", "hello", "world");
String longest = list.stream().max(Comparator.comparing(String::length)).orElse("");
System.out.println(longest); // hello */

import java.util.List;

import java.util.Arrays;

class lngststring{
    public static void main(String[] args) {
       List<String> l= Arrays.asList("hi", "hello", "world");
   // String longest=l.stream().sorted((a,b)->Integer.compare(b.length(),a.length())).limit(1).findFirst().orElse(null);
   String longest=l.stream().max((a,b)->Integer.compare(a.length(),b.length())).orElse(null);
      System.out.print(longest);
    }
}
