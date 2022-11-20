/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modulo;

import java.util.Scanner;

/**
 *
 * @author Pavilion
 */
public class Modulo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // MENENTUKAN BILANGAN itu ganjil atau genap DARI BILANGAN YANG DIINPUT USER
        int X;
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan angka = ");
        X = input.nextInt();
        if (X%2==0)
        {
            System.out.println( X + " Bilangan Genap");
        } else
        {
            System.out.println( X + " Bilangan Ganjil");
        }
    }
    
}
