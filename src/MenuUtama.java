package src;

import java.util.ArrayList;

class MenuUtama {
    private ArrayList<kendaraan> inventaris;
    public MenuUtama(ArrayList<kendaraan> inventaris){
        this.inventaris = inventaris ;
    }
    public void daftarKendaraan(){
        System.out.println("\n--- Daftar Kendaraan ---");
        for (kendaraan k : this.inventaris){
            k.tampilkanDetail();
        }
    }

    public String cekKendaraan(String id, int hari){
        for (kendaraan k : this.inventaris){
            if (id.equalsIgnoreCase(k.getID())){
                return "Biaya total untuk menyewa kendaraan dengan ID " + k.getID() + " selama " + hari + " hari adalah Rp" + (k.hitungBiayaTotal(hari)+k.hitungBiayaTambahan(hari));
            }
        }
        return "Kendaraan dengan ID " + id + " tidak ditemukan.";
    }
    public void kendaraanTersedia(String cari){
        boolean status = false;
        System.out.println("\n--- Kendaraan Tersedia (" + cari + ") ---");
        for (kendaraan k : inventaris){
            if (cari.equalsIgnoreCase(k.getClass().getSimpleName()) && k.isTersedia()){
                k.tampilkanDetail();
                status = true;
            }
        }
        if (status == false){
            System.out.println("Kendaraan yang anda pilih tidak tersedia!");
        }
    }
}
