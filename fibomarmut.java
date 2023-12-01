import java.util.Scanner;

public class fibomarmut {
    static int hitungMarmut(int bulan) {
        if (bulan <= 2) {
            return 1;
        } else {
            return hitungMarmut(bulan - 1) + hitungMarmut(bulan - 2);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan jumlah bulan : ");
        int bulan = sc.nextInt();
        System.out.println("Pasangan marmut pada akhir bulan ke-" + bulan + " adalah: " + hitungMarmut(bulan));
    }
}
