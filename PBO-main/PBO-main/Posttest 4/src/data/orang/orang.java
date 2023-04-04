package data.orang;

public class orang {
    
    String nama;
    String kontak;


    public orang(String nama, String kontak) {
        this.nama = nama;
        this.kontak = kontak;
    }

    public String getNama() {
        return this.nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getKontak() {
        return this.kontak;
    }

    public void setKontak(String kontak) {
        this.kontak = kontak;
    }
    
}
