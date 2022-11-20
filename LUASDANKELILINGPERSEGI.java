/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package luas.dan.keliling.persegi;

import static java.sql.DriverManager.println;
import java.util.Scanner;

/**
 *
 * @author Pavilion
 */
public class LUASDANKELILINGPERSEGI {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // menghitung luas dan keliling persegi jika sisinya diinput oleh user
        int luas,keliling,sisi;
        Scanner input = new Scanner(System.in);
        System.out.println("masukkan sisi : ");
        sisi= input.nextInt();
        luas = sisi * sisi;
        keliling = 4 * sisi;
        System.out.println("luas dari persegi tersebut adalah : " + luas );
        System.out.println("keliliing dari persegi tersebut adalah : " + keliling );
    }
    
}
