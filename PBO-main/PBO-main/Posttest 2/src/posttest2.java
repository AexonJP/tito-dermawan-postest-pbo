import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import data.produk.*;
import data.produsen.*;

public class posttest2 {

    public static void main(String[] args) throws IOException {

        int input;
        obj_prd dta1 = new obj_prd();
        obj_prdn dta2 = new obj_prdn();
        while (true) {

            InputStreamReader isr = new InputStreamReader(System.in);
            BufferedReader inp = new BufferedReader(isr);
            String menu = """
                <=  Pendataan Barang Toko Elektronik  =>
                    \n> Menu : 
                    1. Data Barang
                    2. Data Produsen
                    3. Keluar
                    Masukan Pilihan :""";
            System.out.print(menu);
            input = Integer.parseInt(inp.readLine());

            if (input == 1) {

                boolean loop = true;
                while (loop) {

                    input = dta1.Menu();
                    switch (input) {
                        case 1 -> dta1.Create(dta2);
                        case 2 -> dta1.Read();
                        case 3 -> dta1.Update(dta2);
                        case 4 -> dta1.Delete();
                        case 5 -> loop = false;
                        default -> System.out.println("Input Salah Coba Lagi!");
                    }
                }
            } 
            else if(input == 2) {

                boolean loop = true;
                while (loop) {

                    input = dta2.Menu();
                    switch (input) {
                        case 1 -> dta2.Create();
                        case 2 -> dta2.Read();
                        case 3 -> dta2.Update();
                        case 4 -> dta2.Delete();
                        case 5 -> loop = false;
                        default -> System.out.println("Input Salah Coba Lagi!");
                    }
                }
            } 
            else if(input == 3) {
                break;
            } 
            else {
                System.out.println("Input Salah Coba Lagi!");
            } 
        }
    }
}
