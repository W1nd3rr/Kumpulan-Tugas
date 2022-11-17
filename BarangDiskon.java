
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Pavilion
 */
public class BarangDiskon {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int X,Y,Z,A;
        Scanner input = new Scanner(System.in);
        System.out.println("Masukkan harga Barang Pertama");
        X = input.nextInt();
        System.out.println("Masukkan Harga Barang Kedua ");
        Y = input.nextInt();
        System.out.println("Masukkan Harga Barang Ketiga ");
        Z = input.nextInt();
        A = X+Y+Z;
        if (A >= 250.000)
        {
            System.out.println(A-(15 * A/100));
        } else 
        {
            System.out.println(A);
        }
    }
    
}
