package Headspin;
import java.util.Scanner;
public class pgm2 
{
	public static void main(String[] args)
	{
        Scanner s = new Scanner(System.in);
        System.out.print("Enter a string : ");
 
        String ln = s.nextLine();
        
        ln = ln.toLowerCase();
 
        int vow = 0, con = 0, spac=0;  								// initialisation
        for (int i = 0; i < ln.length(); i++) 						// loop to determine the nature of the character and increment the count
        {
             if (ln.charAt(i) == 'a' || ln.charAt(i) == 'e' || ln.charAt(i) == 'i' || ln.charAt(i) == 'o' || ln.charAt(i) == 'u'){
            	 	 vow++;      }
           
             else if (ln.charAt(i) >= 'a' && ln.charAt(i) <= 'z'){
                     con++;  }
            
             else if (ln.charAt(i) == ' '){
                    spac++;  }
        }
      
        System.out.println("Number of vowels    : " + vow);
        System.out.println("Number of consonants: " + con);
        System.out.println("Number of spaces    : " + spac);

        s.close();
	}

}
