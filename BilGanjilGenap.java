/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bil.ganjil.genap;

import java.util.Scanner;

/**
 *
 * @author Pavilion
 */
public class BilGanjilGenap {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // MENENTUKAN BILANGAN GANJIL ATAU GENAP
        for(int i =1; i<4 ; i++)
        {
            for(int j=0; j<i; j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    
}
