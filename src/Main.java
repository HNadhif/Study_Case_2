package src;
import java.util.Scanner;
import java.util.ArrayList;

public class Main {
    public static void main (String[] args) {
        // Inisialisasi
        ArrayList<kendaraan> inventaris = new ArrayList<>();
        Scanner in = new Scanner(System.in);

        // Membuat kendaraan sebanyak 7 objek
        kendaraan M1 = new mobil("M-0001", "Avanza", 250000, true, false);
        kendaraan M2 = new mobil("M-0002", "Honda", 300000, true, true);
        kendaraan k1 = new motor ("M-0003", "Yamaha", 20000, false);
        kendaraan k2 = new motor("M-0004", "Wuling", 15000, true );
        kendaraan T1 = new Truk("M-0005", "Suzuki", 500000, false, 2);
        kendaraan B1 = new bemo("B-001", "Hyundai", 10000, true, 300);
        kendaraan BS_1 = new Bus("Bus-0001", "Nisan", 750000, true, true);

    }
}
