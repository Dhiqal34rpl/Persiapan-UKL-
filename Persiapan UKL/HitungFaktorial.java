import java.util.Scanner;

public class HitungFaktorial {

    // Fungsi untuk menghitung faktorial
    public static long faktorial(int n) {
        long hasil = 1;
        for (int i = 1; i <= n; i++) {
            hasil *= i;
        }
        return hasil;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan bilangan bulat positif: ");
        int bilangan = input.nextInt();

        if (bilangan < 0) {
            System.out.println("Bilangan harus positif!");
        } else {
            long hasil = faktorial(bilangan);
            System.out.println("Faktorial dari " + bilangan + " adalah: " + hasil);
        }
    }
}
