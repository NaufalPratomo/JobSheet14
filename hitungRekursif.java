import java.util.Scanner;

public class hitungRekursif {
    
    static int hitungPenjumlahan(int n) {
        if (n > 0) {
            int hasil = hitungPenjumlahan(n - 1);
            System.out.print(n);
            if (n > 1) {
                System.out.print(" + ");
            } else {
                System.out.print(" = ");
            }
            return hasil + n;
        } else {
            return 0;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan angka: ");
        int n = sc.nextInt();
        System.out.println(hitungPenjumlahan(n));
    }
}
