//Count Words in Sentence
import java.util.Arrays;

class cntsntc {
    public static void main(String[] args) {
        String s = "java is easy and powerful";
        int x = (int) Arrays.stream(s.split(" ")).count();
        System.out.println(x);  // Output: 5
    }
}
