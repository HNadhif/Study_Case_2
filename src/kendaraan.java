package src;

public abstract class kendaraan {
    // Atribut
    private String id;
    private String nama;
    protected double biayaHarian;
    private boolean tersedia;

    // Constructor
    public kendaraan(String id, String nama, double biayaHarian, boolean tersedia) {
        this.id = id;
        this.nama = nama;
        this.biayaHarian = biayaHarian;
        this.tersedia = tersedia;
    }

    // Method
    public String getID() {
        return this.id;
    }

    public String getNama() {
        return this.nama;
    }

    public double getBiayaHarian() {
        return this.biayaHarian;
    }

    public boolean isTersedia() {
        return this.tersedia;
    }

    public double hitungBiayaTotal(int hari) {
        return hari * this.biayaHarian + hitungBiayaTambahan();
    }

    public void tampilkanDetail() {
        System.out.println( "ID: " + this.id +
                            "\nNama: " + this.nama +
                            "\nBiaya Harian: Rp" + this.biayaHarian +
                            "\nStatus: " + (this.tersedia ? "Tersedia" : "Tidak Tersedia"));
        System.out.println();
    }

    protected abstract double hitungBiayaTambahan();
}
