package src;

class motor extends kendaraan{
    public motor(String id, String nama, double biayaHarian, boolean tersedia) {
        super(id, nama, biayaHarian, tersedia);

    }

    @Override
    protected double hitungBiayaTambahan(){
        return 20000;
    }
    public double hitungBiayaTotal(int hari) {
        return hari * super.biayaHarian + hitungBiayaTambahan() * hari;
    }
}
