package data.produk;

import data.produsen.*;

import java.util.ArrayList;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class obj_prd {
    
    ArrayList<produk> plist = new ArrayList<produk>();
    
    InputStreamReader isr = new InputStreamReader(System.in);
    BufferedReader inp = new BufferedReader(isr);

    public int Menu() throws NumberFormatException, IOException {

        String menu = """
                \n> Menu : 
                  1. Tambah Data
                  2. Lihat Data
                  3. Ubah data
                  4. Hapus Data
                  5. Kembali
                  Masukan Pilihan :""";
        System.out.print(menu);
        int input = Integer.parseInt(inp.readLine());

        return input;
    }

    private String getPrdn(obj_prdn obj) throws IOException {
        
        System.out.print("\n>> Pilih Produsen Produk (0 Untuk batal) :\n");
        for(int i = 0;i < (obj.getArraylist()).size();i++) {
            System.out.println("     " + (i+1) + ". " + ((obj.getArraylist()).get(i)).getNama());
        }
        System.out.println("     " + ((obj.getArraylist()).size()+1) + ". - (Kosongkan)");

        int input;
        do {
            input = Integer.parseInt(inp.readLine());
            if (input > ((obj.getArraylist()).size()+1)) {
                System.out.println(" Input salah coba lagi!");
            }
        }
        while(input > ((obj.getArraylist()).size()+1) & input != 0);
        
        if (input == 0) {
            return "/0";
        }
        else if(input == ((obj.getArraylist()).size()+1)) {
            return " ";
        }
        else{
            return ((obj.getArraylist()).get(input-1)).getNama();
        }
    }

    public void Create(obj_prdn obj) throws IOException {

        System.out.print("\n>> Masukan Nama Produk :");
        String nama = inp.readLine();

        String produsen = getPrdn(obj);
        if (produsen == "/0") {
            return;
        }

        System.out.print("\n>> Masukan Tipe Produk :");
        String tipe = inp.readLine();

        System.out.print(">> Masukan Harga Produk :");
        int harga = Integer.parseInt(inp.readLine());

        System.out.print(">> Masukan Stok Produk :");
        int stok = Integer.parseInt(inp.readLine());

        plist.add(new produk(nama, produsen, tipe, harga, stok));
        System.out.println(">> " + plist.get(plist.size()-1).getNama() + " berhasil ditambah!\n");
    }

    public void Read() throws IOException {

        System.out.println("\n  == List Produk ==\n");
        for(int i = 0;i < plist.size();i++) {
            System.out.println("     " + (i+1) + ". " + (plist.get(i)).getNama());
            System.out.println("        " + (plist.get(i)).getProdusen());
            System.out.println("        " + (plist.get(i)).getTipe());
            System.out.println("        " + (plist.get(i)).getHarga());
            System.out.println("        " + (plist.get(i)).getStok());
        }
    }

    public void Update(obj_prdn obj) throws IOException {

        int idx;
        System.out.print("Masukan index yang diganti : ");
        idx = Integer.parseInt(inp.readLine());
        
        System.out.print("\n>> Masukan Nama Produk :");
        (plist.get(idx-1)).setNama(inp.readLine());

        String produsen = getPrdn(obj);
        if (produsen == "/0") {
            return;
        }
        (plist.get(idx-1)).setProdusen(produsen);

        System.out.print("\n>> Masukan Tipe Produk :");
        (plist.get(idx-1)).setTipe(inp.readLine());

        System.out.print(">> Masukan Harga Produk :");
        (plist.get(idx-1)).setHarga(Integer.parseInt(inp.readLine()));

        System.out.print(">> Masukan Stok Produk :");
        (plist.get(idx-1)).setStok(Integer.parseInt(inp.readLine()));
       
        System.out.println(">> Telah berhasil diubah!\n");
    }

    public void Delete() throws IOException {

        int idx;

        System.out.print("Masukan index yang ingin dihapus : ");
        idx = Integer.parseInt(inp.readLine());

        plist.remove(idx-1);
        System.out.println(">> Telah berhasil dihapus!\n");
    }
}
