/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ifelse;

import java.util.Scanner;

/**
 *
 * @author Pavilion
 */
public class IfElse {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int X;
        Scanner input = new Scanner(System.in);
        System.out.println("masukkan X");
        X = input.nextInt();
        if ( X% 2 ==0 && X%4 ==0)
        {
            System.out.println("bilangan itu adalah genap ");
        } else
        {
            System.out.println("bilangan itu bukan bilangan genap");
        }
    }
    
}
