/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package huruf.fokal.konsonan;

import java.util.Scanner;

/**
 *
 * @author Pavilion
 */
public class HurufFokalKonsonan {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String N;
        Scanner input = new Scanner (System.in);
        System.out.println("Masukkan Huruf");
        N = input.next();
        if ("A".equalsIgnoreCase(N))
        {
            System.out.println( N + " Adalah Bilangan Vokal");
        }
        else if ("I".equalsIgnoreCase(N))
        {
            System.out.println( N + " Adalah Bilangan Vokal");
        }
        else if ("U".equalsIgnoreCase(N))
        {
            System.out.println( N + " Adalah Bilangan Vokal");
        }
        else if ("E".equalsIgnoreCase(N))
        {
            System.out.println( N + " Adalah Bilangan Vokal");
        }
        else if ("O".equalsIgnoreCase(N))
        {
            System.out.println( N + " Adalah Bilangan Vokal");
        }
        else
        {
            System.out.println( N + " Adalah Bilangan Konsonan ");
        }
    }
    
}
