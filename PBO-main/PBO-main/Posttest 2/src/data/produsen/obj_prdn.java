package data.produsen;

import java.util.ArrayList;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class obj_prdn {
    
    ArrayList<produsen> prlist = new ArrayList<produsen>();
    
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

    public void Create() throws IOException {

        System.out.print("\n>> Masukan Nama produsen :");
        String nama = inp.readLine();

        System.out.print(">> Masukan alamat produsen :");
        String alamat = inp.readLine();

        System.out.print(">> Masukan keterangan produsen :");
        String keterangan = inp.readLine();

        prlist.add(new produsen(nama, alamat, keterangan));
        System.out.println(">> " + prlist.get(prlist.size()-1).getNama() + " berhasil ditambah!\n");
    }

    public void Read() throws IOException {

        System.out.println("\n  == List Produk ==\n");
        for(int i = 0;i < prlist.size();i++) {
            System.out.println("     " + (i+1) + ". " + (prlist.get(i)).getNama());
            System.out.println("        " + (prlist.get(i)).getAlamat());
            System.out.println("        " + (prlist.get(i)).getKeterangan());
        }
    }

    public void Update() throws IOException {

        int idx;
        System.out.print("Masukan index yang diganti : ");
        idx = Integer.parseInt(inp.readLine());
        
        System.out.print("\n>> Masukan Nama produsen :");
        (prlist.get(idx-1)).setNama(inp.readLine());

        System.out.print(">> Masukan alamat produsen :");
        (prlist.get(idx-1)).setAlamat(inp.readLine());

        System.out.print(">> Masukan keterangan produsen :");
        (prlist.get(idx-1)).setKeterangan(inp.readLine());
       
        System.out.println(">> Telah berhasil diubah!\n");
    }

    public void Delete() throws IOException {

        int idx;

        System.out.print("Masukan index yang ingin dihapus : ");
        idx = Integer.parseInt(inp.readLine());

        prlist.remove(idx-1);
        System.out.println(">> Telah berhasil dihapus!\n");
    }

    public ArrayList<produsen> getArraylist() {
        return prlist;
    }
}
