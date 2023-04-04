package data.barang.produk;

import data.data;
import data.orang.produsen.*;

import java.util.ArrayList;
import java.io.IOException;

public class prd extends data {

    ArrayList<produk> plist = new ArrayList<produk>();

    public ArrayList<produk> getArraylist() {
        return plist;
    }

    private String getPrdn(prdn obj) {

        System.out.print("\n>> Pilih Produsen Produk (0 Untuk batal) :\n");
        for (int i = 0; i < (obj.getArraylist()).size(); i++) {
            System.out.println("     " + (i + 1) + ". " + ((obj.getArraylist()).get(i)).getNama());
        }
        System.out.println("     " + ((obj.getArraylist()).size() + 1) + ". - (Kosongkan)");

        while (true) {
            try {
                int input = Integer.parseInt(inp.readLine());
                if (input > ((obj.getArraylist()).size() + 1)) {
                    System.out.println(" Input salah coba lagi!");
                } else if (input == 0) {
                    return "/0";
                } else if (input == ((obj.getArraylist()).size() + 1)) {
                    return " ";
                } else {
                    return ((obj.getArraylist()).get(input - 1)).getNama();
                }
            } catch (NumberFormatException | IOException e) {
                System.out.println("Input hanya bisa angka!");
            }
        }
    }

    public void Create(prdn obj) {

        try {
            System.out.print("\n>> Masukan Nama Produk :");
            String nama = inp.readLine();
            
            String produsen = getPrdn(obj);
            if (produsen == "/0") {
                return;
            }
    
            System.out.print("\n>> Masukan Kategori Produk :");
            String kategori = inp.readLine();
    
            System.out.print(">> Masukan Harga Produk :");
            int harga = Integer.parseInt(inp.readLine());
    
            System.out.print(">> Masukan Stok Produk :");
            int stok = Integer.parseInt(inp.readLine());
    
            plist.add(new produk(nama, produsen, kategori, harga, stok));
            System.out.println(">> " + plist.get(plist.size() - 1).getNama() + " berhasil ditambah!\n");

        } catch (IOException e) {
            System.out.println("Terjadi Salah input mohon coba lagi!");
        }
    }

    public void Read() {

        System.out.println("\n  == List Produk ==\n");
        for (int i = 0; i < plist.size(); i++) {
            System.out.println("     " + (i + 1) + ". " + (plist.get(i)).getNama());
            System.out.println("        " + (plist.get(i)).getProdusen());
            System.out.println("        " + (plist.get(i)).getKategori());
            System.out.println("        " + (plist.get(i)).getHarga());
            System.out.println("        " + (plist.get(i)).getStok());
        }
    }

    public void Update(prdn obj) {

        try {
            System.out.print("Masukan urutan yang ingin diganti : ");
            int idx = Integer.parseInt(inp.readLine());

            System.out.print("\n>> Masukan Nama Produk :");
            (plist.get(idx - 1)).setNama(inp.readLine());
    
            String produsen = getPrdn(obj);
            if (produsen == "/0") {
                return;
            }
            (plist.get(idx - 1)).setProdusen(produsen);
    
            System.out.print("\n>> Masukan Kategori Produk :");
            (plist.get(idx - 1)).setKategori(inp.readLine());
    
            System.out.print(">> Masukan Harga Produk :");
            (plist.get(idx - 1)).setHarga(Integer.parseInt(inp.readLine()));
    
            System.out.print(">> Masukan Stok Produk :");
            (plist.get(idx - 1)).setStok(Integer.parseInt(inp.readLine()));
    
            System.out.println(">> Telah berhasil diubah!\n");

        } catch (NumberFormatException | IOException | IndexOutOfBoundsException e) {
            System.out.println("Terjadi Salah input mohon coba lagi!");
        }
    }

    public void Delete(prd obj) {

        try {
            int idx = Idx("Masukan urutan yang ingin dihapus : ");
            obj.getArraylist().remove(idx - 1);
            System.out.println(">> Telah berhasil dihapus!\n");
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Input tidak ada di urutan!");
        }
    }
}
