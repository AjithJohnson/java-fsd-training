
/*
 * 2) Write a program to take an input number from the programmer and calculate all 

 * the prime numbers from 0 to that number. Store all the prime numbers in an array 
 * and display the array elements.
Example: Input=10
Output:
1,2,3,5,7

 */

import java.util.Scanner;

public class program2 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the limit");
		
		int n = sc.nextInt();
		int count;
		int len=0;
		int[] ar = new int[n];
		
		for(int i=2;i<n;i++) {
			count = 0;
			for(int j=2;j<i/2;j++) {
				if(i%j ==0) {
					count++;
					break;
				}
			}
			
			if(count == 0) {
				ar[len] = i;
				len++;
			}
		}
		
		System.out.println("The array element are: ");
		for(int x =0;x<len;x++) {
			System.out.println(ar[x] + " ");
		}	
		sc.close();

	}

}
