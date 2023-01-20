package labtest;

import java.util.*;
public class evenprime {
	
	
	public void even(int even) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter No :");
		int num=sc.nextInt();
		if(num%2==0) {
			System.out.println("The Number Is even "+ num);
		}
		else{
			System.out.println("The Number Is Not even " + num);
			
			return;
		}
		
		
			
		
	}

	public void prime(int prime) {
		
Scanner sc=new Scanner(System.in);
System.out.println("enter No :");
		
		int num=sc.nextInt();
		  
		    int temp = 0;
		 
		    for (int i = 2; i <= num / 2; ++i) {
		      
		      if (num % i == 0) {
		        temp = temp +1;
		     
		        break;
		      }
		    }
		    if (temp==0)
		      System.out.println(num + " is a prime number.");
		    else
		      System.out.println(num + " is not a prime number.");
	}
}
