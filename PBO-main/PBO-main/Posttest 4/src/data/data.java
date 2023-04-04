package data;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class data {

    private BufferedReader inp = new BufferedReader(new InputStreamReader(System.in));
    private String menu = """
        \n> Menu :
            1. Tambah Data
            2. Lihat Data
            3. Ubah data
            4. Hapus Data
            5. Kembali
            Masukan Pilihan :""";
    private ArrayList<String> list = new ArrayList<String>();

    protected String Input() {
        while (true) {
            try {
                String input = inp.readLine();
                return input;
            } catch (IOException e) {
                System.out.println("Terjadi kesalahan dengan input!");
            }
        }
    }

    protected int Input(int type) {
        while (true) {
            try {
                int input = Integer.parseInt(inp.readLine());
                return input;
            } catch (NumberFormatException | IOException e) {
                System.out.println("Input hanya angka!");
            }
        }
    }

    protected String Input(String message) {
        while (true) {
            try {
                System.out.print(message);
                String input = inp.readLine();
                return input;
            } catch (IOException e) {
                System.out.println("Terjadi kesalahan dengan input!");
            }
        }
    }

    protected int Input(String message, int type) {
        while (true) {
            try {
                System.out.print(message);
                int input = Integer.parseInt(inp.readLine());
                return input;
            } catch (NumberFormatException | IOException e) {
                System.out.println("Input hanya angka!");
            }
        }
    }

    public int Menu() {
        return Input(menu, 0);
    }

    public void Create() {
       
        String data = Input("\n>> Masukan Data produsen :");
        list.add(data);
        System.out.println(">> " + data + " berhasil ditambah!\n");
    }

    public void Read() {

        System.out.println("\n  == List Produk ==\n");
        for (int i = 0; i < list.size(); i++) {
            System.out.println("     " + (i + 1) + ". " + list.get(i));
        }
    }

    public void Update() {
        try {
            int idx = Input("Masukan urutan yang ingin diganti : ", 0);
            list.set(idx - 1, Input(">> Masukan Nama produsen :"));
    
            System.out.println(">> Telah berhasil diubah!\n");
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Input tidak ada di urutan!");
        }
    }

    public void Delete() {

        try {
            int idx = Input("Masukan urutan yang ingin dihapus : ", 0);
            list.remove(idx - 1);
            System.out.println(">> Telah berhasil dihapus!\n");
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Input tidak ada di urutan!");
        }
    }
}
    