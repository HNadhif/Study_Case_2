package src;

class mobil extends kendaraan {
    // Atribut
    private boolean bensin;

    // Construction
    public mobil(String id, String nama, double biayaHarian, boolean tersedia, boolean bensin) {
        super(id, nama, biayaHarian, tersedia);
        this.bensin = bensin;
    }

    // Method
    @Override
    protected double hitungBiayaTambahan() {
        return (bensin? getBiayaHarian()*0.1 : 0);
    }
}
