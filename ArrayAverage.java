package Ab52Access2;

import java.util.Scanner;

public class ArrayAverage {
public static void main(String[] args) {
	
	double sum =0;
	double average;
	Scanner s1=new Scanner(System.in);
	
	System.out.println("Please enter the size of your array");
	double [] array=new double[s1.nextInt()];
	
	for(int i=0;i<=array.length-1;i++){
		
		
		System.out.println("Please enter the value of array at index: "+i);
		array[i]= s1.nextDouble();
		sum=sum + array[i];
		}
	System.out.println("The sum of values in your array is-> "+ sum);
	
	average = sum/array.length;
	
	System.out.println("The average of values in your array is-> "+ average);
	s1.close();
	
	
	
	
	
}
}
