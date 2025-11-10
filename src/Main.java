package src;
import java.util.ArrayList;
import java.util.Scanner;

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

        inventaris.add(M1);
        inventaris.add(M2);
        inventaris.add(k1);
        inventaris.add(k2);
        inventaris.add(T1);
        inventaris.add(B1);
        inventaris.add(BS_1);

        int opsi = 0;
        do {
            System.out.println("Menu Persewaan Kendaraan");
            System.out.println("1. Tampilkan semua kendaraan");
            System.out.println("2. Hitung biaya untuk kendaraan tertentu");
            System.out.println("3. Cari kendaraan tersedia berdasarkan jenis");
            System.out.println("0. Keluar");
            
            opsi = in.nextInt();
            switch (opsi){
                
                case 1 :
                break;
                case 2 :
                    in.nextLine();
                    System.out.println("Masukkan ID Kendaraan: ");
                    String id = in.nextLine();
                    System.out.println("Masukkan jumlah hari sewa: ");
                    int hari = in.nextInt();

                    boolean found = false ;
                    for (kendaraan kendaraan : inventaris) {
                        if (kendaraan.getID().equalsIgnoreCase(id)) {
                            found = true;
                            System.out.println("biaya total untuk " + kendaraan.getID() + " selama " + hari + " hari adalah " + kendaraan.hitungBiayaTotal(hari));
                        } 
                    }
                    if (!found) {
                        System.out.println("Kendaraan dengan ID " + id + " tidak ditemukan.");
                    }
                    
                break;
                case 3 :
                    System.out.println("Keluar dari program");
                break;
                case 0 :
                     System.out.println("Terima kasih! Program selesai.");
                    break;

                default:
                    System.out.println("Pilihan tidak valid!");
            }
        } while (opsi != 0);
    }
}
