package src;

public class Truk extends kendaraan {
    private double muatanMaks;

    public Truk(String id, String nama, double biayaHarian, boolean tersedia, double muatanMaks){
        super(id, nama, biayaHarian, tersedia);
        this.muatanMaks = muatanMaks;
    }

    public double getMuatanMaks(){
        return muatanMaks;
    }

    @Override
    protected double hitungBiayaTambahan(int hari){
        return muatanMaks*50000;
    }

}
