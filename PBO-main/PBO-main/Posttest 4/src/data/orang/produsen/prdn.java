package data.orang.produsen;

import data.data;
import java.util.ArrayList;

public class prdn extends data {

    private ArrayList<produsen> prlist = new ArrayList<produsen>();

    public ArrayList<produsen> getArraylist() {
        return prlist;
    }

    public void Create() {
       
        String nama = Input("\n>> Masukan Nama produsen :");
        String kontak = Input(">> Masukan kontak produsen :");
        String alamat = Input(">> Masukan alamat produsen :");
        String keterangan = Input(">> Masukan keterangan produsen :");

        prlist.add(new produsen(nama, kontak, alamat, keterangan));
        System.out.println(">> " + prlist.get(prlist.size() - 1).getNama() + " berhasil ditambah!\n");
    }

    public void Read() {

        System.out.println("\n  == List Produk ==\n");
        for (int i = 0; i < prlist.size(); i++) {
            System.out.println("     " + (i + 1) + ". " + prlist.get(i).getNama());
            System.out.println("        " + prlist.get(i).getKontak());
            System.out.println("        " + prlist.get(i).getAlamat());
            System.out.println("        " + prlist.get(i).getKeterangan());
        }
    }

    public void Update() {
        try {
            int idx = Input("Masukan urutan yang ingin diganti : ", 0);
            prlist.get(idx - 1).setNama(Input(">> Masukan Nama produsen :"));
            prlist.get(idx - 1).setKontak(Input(">> Masukan kontak produsen :"));
            prlist.get(idx - 1).setAlamat(Input(">> Masukan alamat produsen :"));
            prlist.get(idx - 1).setKeterangan(Input(">> Masukan keterangan produsen :"));
    
            System.out.println(">> Telah berhasil diubah!\n");
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Input tidak ada di urutan!");
        }
    }

    public void Delete(prdn obj) {

        try {
            int idx = Input("Masukan urutan yang ingin dihapus : ", 0);
            obj.getArraylist().remove(idx - 1);
            System.out.println(">> Telah berhasil dihapus!\n");
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Input tidak ada di urutan!");
        }
    }
}
