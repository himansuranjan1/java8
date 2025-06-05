import java.util.Arrays;

import java.util.List;

public class upercase {
    public static void main(String[] args) {
        List<String> n = Arrays.asList("java", "spring");
             n.stream().map(i->i.toUpperCase()).forEach(i->System.out.print(i));
    }
}
