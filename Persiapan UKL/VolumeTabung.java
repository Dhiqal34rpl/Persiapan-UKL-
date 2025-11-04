import java.util.Scanner;

public class VolumeTabung {
    // Fungsi untuk menghitung volume tabung
    static double hitungVolume(double jariJari, double tinggi) {
        double volume = Math.PI * jariJari * jariJari * tinggi;
        return volume;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan jari-jari tabung (cm): ");
        double r = input.nextDouble();

        System.out.print("Masukkan tinggi tabung (cm): ");
        double t = input.nextDouble();

        // Memanggil fungsi hitungVolume dengan parameter r dan t
        double volume = hitungVolume(r, t);

        System.out.printf("Volume tabung adalah: %.2f cm³%n", volume);
    }
}
