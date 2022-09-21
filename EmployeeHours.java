//Aiman Haroon
//Instructor: Mariusz Gladys
//Lab 8:  (Two-Dimensional Array)
//Date: 10/17/2020
//About Program: This program asks user to store 8 employee work hours and show the sum of hours in decreasing order

package twoDimensionalArray;

import java.util.Scanner;

public class EmployeeHours
{
	//main method
	public static void main(String[] args) 
	{
	
		Scanner input = new Scanner(System.in);		
		double[][] employeeHours = {
			      {2, 4, 3, 4, 5, 8, 8},
			      {7, 3, 4, 3, 3, 4, 4},
			      {3, 3, 4, 3, 3, 2, 2},
			      {9, 3, 4, 7, 3, 4, 1},
			      {3, 5, 4, 3, 6, 3, 8},
			      {3, 4, 4, 6, 3, 4, 4},
			      {3, 7, 4, 8, 3, 8, 4},
			      {6, 3, 5, 9, 2, 7, 9}};
		
		
	    for (int y = 0; y < hours.length; y++)
	    	System.out.println("Enter the name of Employee: ");
	    	
	    
	    	for (int z = 0; z < hours[y].length; z++) 
	    	{
	    		  System.out.println("Enter hours on " + weekDays[0+z]);
		          hours[y][z] = input.nextInt();   
	    	}
	    
	    
	    
	    for (int row = 0; row < hours.length; row++) 
	        for (int column = 0; column < hours[row].length; column++) 
	        {
	            System.out.println(hours[row][column] + " ");
	        }
	    	System.out.println();
	}
	    
}
	
	

