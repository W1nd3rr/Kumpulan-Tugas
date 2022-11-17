
public class Star2 {


    public static void main(String[] args) {
        // Y = Baris sedanglkan X = kolom
        for (int y = 1; y <= 3; y++) // susah dijelaskan dengan kata"
        {
            for ( int x = 1; x <= 3; x++)
            {
                if (x == 2 && y >= 1 && y <= 2 || y == 3 && y >= 1 && y <= 3)
                {
                    System.out.print("*");
                }
                else
                {
                    System.out.print(" ");
                }
                
            } System.out.println(); 
        }
    }
    }
    
