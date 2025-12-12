package day03;

import java.util.Scanner;

public class ExampleForJaggedArray {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the number of batches");
		int n = s.nextInt();
		
		System.out.println("Enter the number of students for batch 1");
		int firstbatch = s.nextInt();
		
		System.out.println("Enter the number of students for batch 2");
		int secondbatch = s.nextInt();
		
		int arr[][] = new int[n][];
		arr[0] = new int[firstbatch];
		arr[1] = new int[secondbatch];
		
		for(int i=0;i<=arr.length-1;i++)//Batches
		{
			for(int j=0;j<=arr[i].length-1;j++)//student
			{
				System.out.println("Enter the age of student " + j + " from batch " + i);
				arr[i][j] = s.nextInt();
			}
		}
		
		System.out.println("-------------------------------------------");
		
		System.out.println("The ages are : ");
		
		for(int i=0;i<=arr.length-1;i++)//Batches
		{
			for(int j=0;j<=arr[i].length-1;j++)//student
			{
				System.out.println("The age of student " + j + " from batch " + i + " is " + arr[i][j]);
				
			}
		}
	}

}

/*Disadvantages 
 * 
 * 1. Arrays can only store homogenerous data(similar datatype) not heterogeneous
 * 2. Insertion and deletion is diffcult
 * 3. Array require contiguous memory allocation
 * 4. Array size will not grow or shrink
 */




















