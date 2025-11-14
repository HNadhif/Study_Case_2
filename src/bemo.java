package src;

class bemo extends kendaraan{
    private double jarak;
    public bemo(){
        super(null,null,0,false);
        this.jarak = 0;
    }

    public bemo(String idUnik, String namaKendaraan, double biayaHarian, boolean ketersediaan, double jarak){
        super(idUnik, namaKendaraan, biayaHarian, ketersediaan);
        this.jarak = jarak;
    }

    @Override
    protected double hitungBiayaTambahan(int hari){
        if (this.jarak <= 0){
            System.out.println("Jarak tidak boleh kurang dari sama dengan 0");
            return 0;
        }
        return this.jarak*2000;
    }
}
