
import java.util.Scanner;


public class PartB{
	public static void main(String[] args)
	
	{
			
	
	int b,x,bulb,num=0;
        Scanner enter = new Scanner(System.in);

	while(true)
			{
				
		System.out.println("Enter an Integer:");
		
		b= enter.nextInt();		

				
	if(b<111||b>900)
				
	{
					
	System.out.println("Enter Integer should be between 111 and 900:");	
	continue;
				
	}
				
	else
				
	{
					
	System.out.println("The "+b+" prime factors are:");


					
	for(x=2;x<=b;)
		
	{
	bulb=b%x;
						
	if(bulb!=0)
						
	{

	if(num>0)

	{
								
	System.out.print(x+"^"+num);

	if(b!=1)

	{
									
	System.out.print("*");
								
	}
							
	}
							
	x++;
							
	num=0;

	}	
						
	else

	{
							
	b=b/x;
		
	num++;
	}
					}
					
				
	}

	System.out.print(x+"^"+num);

	break;
			}
			
	System.out.println();
		}
	}

	
