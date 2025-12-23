package oops.methods.staticexample;

public class MathUtils {

    static int add(int a, int b) {
        return a + b;
    }

    public static void main(String[] args) {
        int sum = MathUtils.add(1, 2);
        System.out.println(sum);
    }
}
