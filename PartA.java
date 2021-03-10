



import java.util.Scanner;


 
public class PartA
{
	
	public static void main(String[] args)
	
	  {
	
	      int m,x,bulb;
	
	      Scanner enter = new Scanner(System.in);
			
	      while(true)
			
	       {
				
	   	System.out.println("Enter an Integer:");
		m=enter.nextInt();
				
	         if(m<111||m>900)
				{
					
	       	System.out.println("Enter Integer should be between 111 and 900:");	

		continue;
				}
				
	         else
				{
					
	        	 System.out.println("The "+m+" prime factors are:");
		
		for(x=2;x<=m;)
					
	         {
						
	           bulb=m%x;
						
	           if(bulb!=0)
						
	            {
	            x++;
						
	             }
						
	              else
						
	{
						
	              m=m/x;
						
	             System.out.print(x);
						
	         if(m!=1)
	{

		System.out.print("*");
		
					}
		
					}

					}
				
	}	
			break;
		
		}
			
	System.out.println();

		}
	}