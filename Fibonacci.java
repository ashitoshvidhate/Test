// fibonacci.java
public class Fibonacci {
    public static void main(String[] args) {
        int n = 20;
        int a = 0, b = 1;
        System.out.print("Fibonacci Series with " + n + " numbers: ");
        for (int i = 1; i <= n; i++) {
            System.out.print(a + " ");
            int sum = a + b;
            a = b;
            b = sum;
        }
    }
}