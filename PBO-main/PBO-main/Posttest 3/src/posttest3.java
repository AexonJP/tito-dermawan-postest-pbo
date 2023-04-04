import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import data.barang.produk.*;
import data.orang.produsen.*;

public class posttest3 {

    public static void main(String[] args) {

        prd dta1 = new prd();
        prdn dta2 = new prdn();
        BufferedReader inp = new BufferedReader(new InputStreamReader(System.in));
        String menu = """
                <=  Pendataan Barang Toko Elektronik  =>
                    \n> Menu :
                    1. Data Barang
                    2. Data Produsen
                    3. Keluar
                    Masukan Pilihan :""";

        while (true) {

            try {
                System.out.print(menu);
                int input = Integer.parseInt(inp.readLine());

                if (input == 1) {

                    boolean loop = true;
                    while (loop) {
                        
                        System.out.println("  <=  Menu Produk  =>  ");
                        input = dta1.Menu();
                        switch (input) {
                            case 1 -> dta1.Create(dta2);
                            case 2 -> dta1.Read();
                            case 3 -> dta1.Update(dta2);
                            case 4 -> dta1.Delete(dta1);
                            case 5 -> loop = false;
                            default -> System.out.println("Input Salah Coba Lagi!");
                        }
                    }
                } else if (input == 2) {

                    boolean loop = true;
                    while (loop) {

                        System.out.println("  <=  Menu Produsen  =>  ");
                        input = dta2.Menu();
                        switch (input) {
                            case 1 -> dta2.Create();
                            case 2 -> dta2.Read();
                            case 3 -> dta2.Update();
                            case 4 -> dta2.Delete(dta2);
                            case 5 -> loop = false;
                            default -> System.out.println("Input Salah Coba Lagi!");
                        }
                    }
                } else if (input == 3) {
                    break;
                } else {
                    System.out.println("Input Salah Coba Lagi!");
                }

            } catch (NumberFormatException | IOException e) {
                System.out.println("input hanya angka!");
            }
        }
    }
}
