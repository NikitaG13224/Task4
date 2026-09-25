import java.util.Scanner;

public class Task4 {
    public static double computeSum(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("n должно быть >= 0");
        }

        double sum = 0.0;
        double factorial = 1.0;
        int sign = -1;

        for (int k = 1; k <= n; k++) {
            factorial *= k;
            sum += sign * (k + 1) / factorial;
            sign = -sign;
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите n: ");
        int n = scanner.nextInt();
        if (n <=0)
        System.out.println("n должно быть больше нуля" );
        else
        System.out.println("Сумма ряда: " + computeSum(n));

        scanner.close();
    }
}


