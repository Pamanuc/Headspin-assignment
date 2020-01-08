package Headspin;
import java.util.Scanner;
public class pgm1 
{
    public static void main(String args[])           
    { 
        int n;
        Scanner s = new Scanner(System.in);
        System.out.print("Enter array size:");
        n = s.nextInt();
        int a[] = new int[n];
        
        System.out.println("Enter all the elements:");
        for(int i = 0; i < n; i++)
           a[i] = s.nextInt();
           
        int big=a[0], small=a[0];   			//initialisation
        for(int i = 0; i < n; i++)				//loop to find smallest and largest
        { 
        	if(a[i]>big)big=a[i];
            if(a[i]<small)small=a[i];
        }   
        
        System.out.println("Smallest : "+small);
        System.out.println("Largest  : "+big);
        s.close();
        
    }   

}
