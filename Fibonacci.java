// fibonacci.java
public class Fibonacci {
    public static void main(String[] args) {
        int n = 20;
        int a = 0, b = 1;
        System.out.print("Armstrong Numbers with " + n + " numbers: ");
        for (int i = 1; i <= n; i++) {
            if (isArmstrong(a))
                System.out.print(a + " ");
            int sum = a + b;
            a = b;
            b = sum;
        }
    }

    static boolean isArmstrong(int num) {
        int original = num;
        int sum = 0;
        while (num > 0) {
            int digit = num % 10;
            sum += Math.pow(digit, 3);
            num /= 10;
        }
        return sum == original;
    }
}
