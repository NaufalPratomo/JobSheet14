import java.util.Scanner;

public class CekPrimaRekursif {
    static boolean isPrima(int n, int i) {
        if (n <= 2) {
            return (n == 2) ? true : false;
        }
        if (n % i == 0) {
            return false;
        }
        if (i * i > n) {
            return true;
        }
        return isPrima(n, i + 1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan angka: ");
        int n = sc.nextInt();
        if (isPrima(n, 2)) {
            System.out.println(n + " adalah bilangan prima");
        } else {
            System.out.println(n + " bukan bilangan prima");
        }
    }
}
