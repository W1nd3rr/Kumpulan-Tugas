
import java.util.Scanner;


public class Zodiak {


    public static void main(String[] args) {
        int tanggal,bulan;
        Scanner input = new Scanner(System.in);
        System.out.print("masukkan tanggal lahir anda : ");
        tanggal = input.nextInt();
        System.out.print("masukkan bulan lahir anda : ");
        bulan = input.nextInt();
        if (tanggal >= 19 && tanggal <=22 && bulan ==12 || bulan == 1)
        {
            System.out.println("Zodiak Anda Adalah CAPRICORN ");
        } else if (tanggal >=18 && tanggal <= 20 && bulan == 1 || bulan == 2)
        {
            System.out.println("Zodiak Anda Adalah AQUARIUS ");
        } else if (tanggal >=19 && tanggal <=20 && bulan == 2 || bulan == 3)
        {
            System.out.println("Zodiak Anda Adalah PISCES ");
        } else if (tanggal >= 19 && tanggal <= 21 && bulan ==3 || bulan == 4)
        {
            System.out.println("Zodiak Anda Adalah ARIES ");
        } else if (tanggal == 20 && bulan == 4 || bulan == 5)
        {
            System.out.println("Zodiak Anda Adalah TAURUS ");
        } else if (tanggal >= 20 && tanggal <= 21 && bulan == 5 || bulan == 6)
        {
            System.out.println("Zodiak Anda Adlah GEMINI ");
        } else if (tanggal >= 20 && tanggal <= 21 && bulan == 6 || bulan == 7)
        {
            System.out.println("Zodiak Anda Adalah CANCER ");
        } else if (tanggal >= 22 && tanggal <= 23 && bulan == 7 || bulan == 8)
        {
            System.out.println("Zodiak Anda Adalah LEO ");
        } else if (tanggal >= 22 && tanggal <= 23 && bulan == 8 || bulan == 9)
        {
            System.out.println("Zodiak Anda Adalah VIRGO ");
        } else if (tanggal >= 22 && tanggal <= 23 && bulan == 9 || bulan == 10)
        {
            System.out.println("Zodiak Anda Adlah LIBRA ");
        } else if (tanggal >= 21 && tanggal <= 23 && bulan == 10 || bulan == 11)
        {
            System.out.println("Zodiak Anda Adalah SCROPIO ");
        } else if (tanggal >= 21 && tanggal <= 22 && bulan == 11 || bulan == 12)
        {
            System.out.println("Zodiak Anda Adalah SAGITTARIUS ");
        }
    }
    
}
