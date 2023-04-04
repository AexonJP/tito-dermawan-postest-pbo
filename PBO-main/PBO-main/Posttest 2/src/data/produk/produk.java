package data.produk;

class produk {
    
    private String nama;
    private String produsen;
    private String tipe;
    private int harga;
    private int stok;

    public produk(String nama, String produsen, String tipe, int harga, int stok) {
        this.nama = nama;
        this.produsen = produsen;
        this.tipe = tipe;
        this.harga = harga;
        this.stok = stok;
    }

    public String getNama() {
        return this.nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getProdusen() {
        return this.produsen;
    }

    public void setProdusen(String produsen) {
        this.produsen = produsen;
    }

    public String getTipe() {
        return this.tipe;
    }

    public void setTipe(String tipe) {
        this.tipe = tipe;
    }

    public int getHarga() {
        return this.harga;
    }

    public void setHarga(int harga) {
        this.harga = harga;
    }

    public int getStok() {
        return this.stok;
    }

    public void setStok(int stok) {
        this.stok = stok;
    }
}
