
package menghitung.tiga.bilangan;

import static java.awt.PageAttributes.MediaType.B;
import java.util.Scanner;
import static javafx.print.Paper.C;

public class MENGHITUNGTIGABILANGAN {

    public static void main(String[] args) {
        // MENENTUKAN ANGKA TERBESAR DARI TIGA BILANGAN YANG DIINPUT OLEH USER
        int a,b,c;
        Scanner input = new Scanner (System.in);
        System.out.println("Masukkan Aangka Pertama :");
        a = input.nextInt();
        System.out.println("Masukkan Aangka Kedua :");
        b = input.nextInt();
        System.out.println("Masukkan Aangka Ketiga :");
        c = input.nextInt();
        if (a>=b && a>=c)
        {
            System.out.println(a);
        } else if (b>=c )
        {
            System.out.println(b);
        } else 
        {
            System.out.println(c);
        }
    }
    
}
