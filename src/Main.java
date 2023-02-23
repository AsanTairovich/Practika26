import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Generic<String, Integer> generic = new Generic<>("Asan",25);
        generic.method(new int[]{1,23,4,5,3,3456,54,6});
    }
}