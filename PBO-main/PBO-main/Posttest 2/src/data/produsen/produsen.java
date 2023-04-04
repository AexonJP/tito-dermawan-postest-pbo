package data.produsen;

public class produsen {
    
    private String nama;
    private String alamat;
    private String keterangan;


    public produsen(String nama, String alamat, String keterangan) {
        this.nama = nama;
        this.alamat = alamat;
        this.keterangan = keterangan;
    }

    public String getNama() {
        return this.nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getAlamat() {
        return this.alamat;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    public String getKeterangan() {
        return this.keterangan;
    }

    public void setKeterangan(String keterangan) {
        this.keterangan = keterangan;
    }
}
