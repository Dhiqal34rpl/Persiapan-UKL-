import java.util.Scanner;

public class RataRataNilaiRPL {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan jumlah siswa: ");
        int jumlahSiswa = input.nextInt();

        double[] nilaiSiswa = new double[jumlahSiswa]; // Array untuk menyimpan nilai siswa
        double totalNilai = 0;

        // Input nilai setiap siswa
        for (int i = 0; i < jumlahSiswa; i++) {
            System.out.print("Masukkan nilai siswa ke-" + (i + 1) + ": ");
            nilaiSiswa[i] = input.nextDouble();
            totalNilai += nilaiSiswa[i];
        }

        // Menghitung rata-rata
        double rataRata = totalNilai / jumlahSiswa;

        System.out.println("\n=== Rekap Nilai Siswa ===");
        for (int i = 0; i < jumlahSiswa; i++) {
            System.out.println("Siswa ke-" + (i + 1) + ": " + nilaiSiswa[i]);
        }

        System.out.printf("\nRata-rata nilai ujian Produktif RPL adalah: %.2f%n", rataRata);
    }
}
