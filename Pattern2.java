package com.anpc8232.day3;

public class Pattern2
{

	public static void main(String[] args)
	{
		        for (int i = 0; i < 5; i++)
		        {
		            for (int j=0; j <5-i - 1; j++)
		            {
		                System.out.print(" ");
		            }
		            for (int k = 0; k <= i; k++)
		            {
		                System.out.print("* ");
		            }
		            System.out.println();
		        }
	}
}	
	


