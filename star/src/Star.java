
public class Star {

    public static void main(String[] args) {
        // TODO code application logic here
        for(int i=1;i<=3;i++)
            // i awalnya beranilai 1 tapi karena adnya perulangan jadi akan bertambah satu
        {
            for (int j=1;j<=i;j++)
                // j awalnya juga bernilai 1 tapi karena adnya perulangan jadi akan bertambah satu
            { // jika kondisi diatas memenuhi atau "TRUE" maka akan memunculkan "*"
                System.out.print("*");
            } System.out.println(); // jika tidak memenuhi maka akan membuat baris baru
        }
    }
    
}
