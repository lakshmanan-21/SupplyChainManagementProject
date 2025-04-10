package com.facilities.generic.javautility;

import java.util.Random;

public class JavaUtility 
{
	public int getRandomNumber()
	{
		Random random=new Random();
		int randomnumber=random.nextInt(5000);
		return randomnumber;
		
	}

}
