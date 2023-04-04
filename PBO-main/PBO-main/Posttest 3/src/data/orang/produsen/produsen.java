package data.orang.produsen;

import data.orang.*;

public class produsen extends orang {

    private String alamat;
    private String keterangan;

    public produsen(String nama, String kontak, String alamat, String keterangan) {
        super(nama, kontak);
        this.alamat = alamat;
        this.keterangan = keterangan;
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
