// 8)Write a java program to take an input array of integers and sort the array using insertion sort


import java.util.Scanner;

public class program8 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the array size");
		int size=sc.nextInt();
		int arr[]=new int[size];
		System.out.println("enter the array elements");
		for(int i=0;i<size;i++)
			arr[i]=sc.nextInt();
		System.out.println("sorted array ");
		sortInsertion(arr,size);
		for(int k=0;k<size;k++)
			System.out.print(arr[k]+" ");
	}	
	public static void sortInsertion(int arr[],int size)
	{
		int current=0,j=0;
		for(int i=0;i<size;i++)
		{
			current=arr[i];
			j=i-1;
			while(j>=0 && arr[j]>current)
			{
				arr[j+1]=arr[j];
				j--;
			}
			arr[j+1]=current;
		}
	}


	}
