// fibonacci.java
public class Fibonacci {
    public static void main(String[] args) {
        int n = 20;
        int a = 0, b = 1;
        System.out.print("Prime Numbers with " + n + " numbers: ");
        for (int i = 1; i <= n; i++) {
            if (isPrime(a))
                System.out.print(a + " ");
            int sum = a + b;
            a = b;
            b = sum;
        }
    }

    static boolean isPrime(int num) {
        if (num < 2)
            return false;
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0)
                return false;
        }
        return true;
    }
}
