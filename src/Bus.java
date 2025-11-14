package src;

class Bus extends kendaraan{
    private boolean fasilitasAC;

    public Bus(String id, String nama, double biayaHarian, boolean tersedia, boolean fasilitasAC){
        super(id, nama, biayaHarian, tersedia);
        this.fasilitasAC = fasilitasAC;
    }

    @Override
    protected double hitungBiayaTambahan() {
        return fasilitasAC ? getBiayaHarian() * 0.15 : 0;
    }
}