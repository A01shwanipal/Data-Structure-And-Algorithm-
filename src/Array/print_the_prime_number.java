package Array;

import java.util.Scanner;

public class print_the_prime_number {

	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number  the number to check");
		int n = sc.nextInt();
		
		boolean status = true;
		
		 if(n <= 1) {
	            status = false;
		 }
		 
		 
		
		for(int i = 2 ; i<n-1;i++){
			
			if(n%i==0) {
				status = false;
				break;
				
			}
			
		}
		
		 if(status) {
	            System.out.println("This is a prime number");
	        } else {
	            System.out.println("This is not a prime number");
	        }
		
		
	}
}
