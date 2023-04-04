package obj;

import java.util.ArrayList;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class data {
    
    ArrayList<produk> plist = new ArrayList<produk>();
    
    InputStreamReader isr = new InputStreamReader(System.in);
    BufferedReader inp = new BufferedReader(isr);

    public int Menu() throws NumberFormatException, IOException {

        String menu = """
                \n> Menu : 
                  1. Create
                  2. Read
                  3. Update
                  4. Delete
                  5. Exit
                  Masukan Pilihan :""";
        System.out.print(menu);
        int input = Integer.parseInt(inp.readLine());

        return input;
    }

    public void Create() throws IOException {

        produk prd = new produk();
        prd.create();
        plist.add(prd);
        System.out.println(">> " + plist.get(plist.size()-1).nama + " berhasil ditambah!\n");
    }

    public void Read() throws IOException {

        System.out.println("\n  == List Produk ==\n");
        for(int i = 0;i < plist.size();i++) {
            System.out.println("     " + (i+1) + ". " + (plist.get(i)).nama);
            System.out.println("        " + (plist.get(i)).produsen);
            System.out.println("        " + (plist.get(i)).tipe);
            System.out.println("        " + (plist.get(i)).harga);
            System.out.println("        " + (plist.get(i)).stok);
        }
    }

    public void Update() throws IOException {

        int idx;
        produk prd = new produk();

        System.out.print("Masukan index yang diganti : ");
        idx = Integer.parseInt(inp.readLine());
        System.out.println("Masukan data yang baru! ");
        prd.create();

        plist.set(idx-1, prd);
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
