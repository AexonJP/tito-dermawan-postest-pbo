package data.orang.produsen;

import data.data;

import java.util.ArrayList;
import java.io.IOException;

public class prdn extends data {

    ArrayList<produsen> prlist = new ArrayList<produsen>();

    public ArrayList<produsen> getArraylist() {
        return prlist;
    }

    public void Create() throws IOException {

        System.out.print("\n>> Masukan Nama produsen :");
        String nama = inp.readLine();

        System.out.print(">> Masukan kontak produsen :");
        String kontak = inp.readLine();

        System.out.print(">> Masukan alamat produsen :");
        String alamat = inp.readLine();

        System.out.print(">> Masukan keterangan produsen :");
        String keterangan = inp.readLine();

        prlist.add(new produsen(nama, kontak, alamat, keterangan));
        System.out.println(">> " + prlist.get(prlist.size() - 1).getNama() + " berhasil ditambah!\n");
    }

    public void Read() {

        System.out.println("\n  == List Produk ==\n");
        for (int i = 0; i < prlist.size(); i++) {
            System.out.println("     " + (i + 1) + ". " + (prlist.get(i)).getNama());
            System.out.println("        " + (prlist.get(i)).getKontak());
            System.out.println("        " + (prlist.get(i)).getAlamat());
            System.out.println("        " + (prlist.get(i)).getKeterangan());
        }
    }

    public void Update() {

        try{
            int idx = Idx("Masukan urutan yang ingin diganti : ");

            System.out.print("\n>> Masukan Nama produsen :");
            (prlist.get(idx - 1)).setNama(inp.readLine());

            System.out.print(">> Masukan kontak produsen :");
            (prlist.get(idx - 1)).setKontak(inp.readLine());

            System.out.print(">> Masukan alamat produsen :");
            (prlist.get(idx - 1)).setAlamat(inp.readLine());

            System.out.print(">> Masukan keterangan produsen :");
            (prlist.get(idx - 1)).setKeterangan(inp.readLine());

            System.out.println(">> Telah berhasil diubah!\n");

        } catch (IOException | IndexOutOfBoundsException e) {
            System.out.println("Terjadi Salah input mohon coba lagi!");
        }
    }

    public void Delete(prdn obj) {

        try {
            int idx = Idx("Masukan urutan yang ingin dihapus : ");
            obj.getArraylist().remove(idx - 1);
            System.out.println(">> Telah berhasil dihapus!\n");
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Input tidak ada di urutan!");
        }
    }
}
