package Headspin;
import java.util.Scanner;
public class pgm3 
{ 
	public static void main(String[] args)
	{
	  Scanner s = new Scanner(System.in);
    System.out.print("Enter a string to rearange : ");

    String ln = s.nextLine();
	  
    char[] array = ln.toCharArray();
    int len = array.length,k=1;
    len=len-1;
    int l=len,i=0,j=0;
    char[] res=new char[array.length];
		for(i=len,j=0 ; i>=0 ; i--,j++)
		{	
			res[j]=array[i];
					
			if(i==0)break;
			if(array[i] == ' ')
			{	
				for(k=i-1 ; array[k] != ' ' && k>0 ; k--)
				{
					res[l]=array[k];
					l--;
				}
				if(k==0) {res[l]=array[0];break;}
				res[--l]=' ';		
				i=k;
			}if(k==0)break;
		} 
		System.out.println(res);
		s.close();
	}

}
