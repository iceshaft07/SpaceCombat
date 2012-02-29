package com.spacecombat;

import java.util.Random;

public class Util 
{
	private static Random random;
	
	static
	{
		random = new Random();
	}
	
	public static int RandomNumber (int num1, int num2)
	{
		if (random == null)
		{
			random = new Random();
		}	
		num2 = num2+1;
		return (Math.abs(random.nextInt()) % (num2-num1)) + num1;
	}
}
