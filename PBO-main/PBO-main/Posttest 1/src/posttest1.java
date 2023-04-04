import java.io.IOException;
import obj.data;

public class posttest1 {

    public static void main(String[] args) throws IOException {

        data dta = new data();

        while (true) {
            int input = dta.Menu();
    
            if (input == 1) {
                dta.Create();
            } 
            else if(input == 2) {
                dta.Read();
            } 
            else if(input == 3) {
                dta.Update();
            } 
            else if(input == 4) {
                dta.Delete();
            } 
            else if(input == 5) {
                break;
            }
            else {
                System.out.println("Input Salah Coba Lagi!");
            }
        }
    }
}
