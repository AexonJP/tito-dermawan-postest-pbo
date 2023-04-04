package data;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class data {

    protected BufferedReader inp;
    protected String menu;

    protected data() {
        this.inp = new BufferedReader(new InputStreamReader(System.in));
        this.menu = """
                \n> Menu :
                    1. Tambah Data
                    2. Lihat Data
                    3. Ubah data
                    4. Hapus Data
                    5. Kembali
                    Masukan Pilihan :""";
    }

    public int Menu() {

        while (true) {
            try {
                System.out.print(menu);
                int input = Integer.parseInt(inp.readLine());
                return input;
            } catch (NumberFormatException | IOException e) {
                System.out.println("Input hanya angka!");
            }
        }
    }

    protected int Idx(String message) {
        System.out.print(message);
        try {
            int idx = Integer.parseInt(inp.readLine());
            return idx;
        } catch (NumberFormatException | IOException e) {
            System.out.println("Input salah (hanya angka)!");
            return 0;
        }
    }
}
