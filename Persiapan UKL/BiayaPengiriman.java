import java.util.Scanner;

public class BiayaPengiriman {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Input data
        System.out.print("Masukkan berat paket (kg): ");
        double berat = input.nextDouble();

        System.out.print("Masukkan jarak tempuh (km): ");
        double jarak = input.nextDouble();

        System.out.print("Masukkan panjang paket (cm): ");
        double panjang = input.nextDouble();

        System.out.print("Masukkan lebar paket (cm): ");
        double lebar = input.nextDouble();

        System.out.print("Masukkan tinggi paket (cm): ");
        double tinggi = input.nextDouble();

        // Hitung volume
        double volume = panjang * lebar * tinggi;

        // Tentukan biaya berdasarkan jarak
        double biayaPerKg;
        if (jarak <= 10) {
            biayaPerKg = 4250;
        } else {
            biayaPerKg = 6000;
        }

        // Hitung biaya dasar pengiriman
        double biayaPengiriman = berat * biayaPerKg;

        // Tambahkan biaya tambahan jika volume melebihi 100 cm^3
        if (volume > 100) {
            biayaPengiriman += 50000;
        }

        // Tampilkan hasil
        System.out.println("\n===== RINCIAN BIAYA PENGIRIMAN =====");
        System.out.println("Berat paket : " + berat + " kg");
        System.out.println("Jarak tempuh : " + jarak + " km");
        System.out.println("Volume paket : " + volume + " cm³");
        System.out.println("------------------------------------");
        System.out.println("Total biaya pengiriman : Rp " + biayaPengiriman);

        input.close();
    }
}
