package obj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class produk {

    InputStreamReader isr = new InputStreamReader(System.in);
    BufferedReader inp = new BufferedReader(isr);

    String nama;
    String produsen;
    String tipe;
    int harga;
    int stok;

    public void create() throws IOException {
        System.out.print("\n>> Masukan Nama Barang :");
        nama = inp.readLine();
        System.out.print(">> Masukan Nama Produsen Barang :");
        produsen = inp.readLine();
        System.out.print(">> Masukan Tipe Barang :");
        tipe = inp.readLine();
        System.out.print(">> Masukan Harga Barang :");
        harga = Integer.parseInt(inp.readLine());
        System.out.print(">> Masukan Stok Barang :");
        stok = Integer.parseInt(inp.readLine());
    }
}
