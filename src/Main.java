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

    }
}
