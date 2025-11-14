package src;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main (String[] args) {
        // Inisialisasi
        ArrayList<kendaraan> inventaris = new ArrayList<>();
        Scanner in = new Scanner(System.in);

        // Membuat kendaraan sebanyak 7 objek
        kendaraan M1 = new mobil("MB-001", "Toyota Avanza", 250000, true, false);
        kendaraan M2 = new mobil("MB-002", "Honda Jazz", 300000, false, true);
        kendaraan k1 = new motor ("MT-001", "Yamaha NMAX", 100000, false);
        kendaraan k2 = new motor("MT-002", "Honda Beat", 85000, true);
        kendaraan T1 = new Truk("TR-001", "Isuzu Giga", 500000, false, 2);
        kendaraan B1 = new bemo("BM-001", "Hyundai Bemo", 50000, true, 15);
        kendaraan BS_1 = new Bus("BS-001", "Nissan Bus", 750000, true, true);

        inventaris.add(M1);
        inventaris.add(M2);
        inventaris.add(k1);
        inventaris.add(k2);
        inventaris.add(T1);
        inventaris.add(B1);
        inventaris.add(BS_1);
        
        MenuUtama menu = new MenuUtama(inventaris);

        int opsi = 0;
        do {
            System.out.println("Menu Persewaan Kendaraan");
            System.out.println("1. Tampilkan semua kendaraan");
            System.out.println("2. Hitung biaya untuk kendaraan tertentu");
            System.out.println("3. Cari kendaraan yang tersedia berdasarkan jenis");
            System.out.println("0. Keluar");
            System.out.print("Masukkan pilihan : ");
            opsi = in.nextInt();

            switch (opsi){
                case 0 :
                    System.out.println("Terima kasih! Program selesai.");
                break;
                case 1 :
                    menu.daftarKendaraan();
                break;
                case 2 :
                    in.nextLine();
                    System.out.print("Masukkan ID Kendaraan: ");
                    String id = in.nextLine();
                    System.out.print("Masukkan jumlah hari sewa: ");
                    int hari = in.nextInt();
                    System.out.println(menu.cekKendaraan(id, hari));
                    System.out.println();
                break;
                case 3 :
                    in.nextLine();
                    System.out.print("Ketik jenis kendaraan yang ingin Anda cari (Mobil/Motor/Truk/Bemo/Bus): "); String cari = in.nextLine();
                    menu.kendaraanTersedia(cari);
                break;
                default :
                    System.out.println("\nPilihan tidak ada di dalam menu, ulangi lagi!\n");
            }

        } while (opsi != 0);
    }
}
