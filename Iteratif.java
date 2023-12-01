import java.util.Scanner;

public class Iteratif {
    static void tampilkan(int n) {
        for (int i = n; i >= 0; i--) {
            System.out.println(i);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan nilai n : ");
        int n = sc.nextInt();
        tampilkan(n);
    }
}
