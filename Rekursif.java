import java.util.Scanner;

public class Rekursif {
    static void tampilkan(int n) {
        if (n >= 0) {
            System.out.println(n);
            tampilkan(n - 1);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan nilai n : ");
        int n = sc.nextInt();
        tampilkan(n);
    }
}
