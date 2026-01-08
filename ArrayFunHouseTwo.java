// A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import java.lang.System;
import java.lang.Math;

public class ArrayFunHouseTwo
{
	//goingUp() will return true if all numbers
	//in numArray are in increasing order
	//[1,2,6,9,23] returns true
	//[9, 11, 13, 8]  returns false
	public static boolean goingUp(int[] numArray)
	{
		//traditional for loop that will repeat while i is less than last index because at the last index can't and doesn't need to be checked
		for(int i = 0; i<( numArray.length-1); i++)
		{
			// if the current postion in the array is greater than the next number, numarray is not in increasing order and should return false
			if (numArray[i] > numArray[i+1])
				return false;

		}

		//if the code passes the loop, it means there is not a point where numarray is decreasing, meaning it is always going up
		return true;
	}

	//goingDown() will return true if all numbers
	//in numArray are in decreasing order
	//[31,12,6,2,1] returns true
	//[31, 20, 10, 15, 9] returns false
	public static boolean goingDown(int[] numArray)
	{
	//traditional for loop that will repeat while i is less than last index because at the last index can't and doesn't need to be checked
		for(int i = 0; i<( numArray.length-1); i++)
		{
			// if the current postion in the array is less than the next number, numarray is not in decreasing order and should return false
			if (numArray[i] < numArray[i+1])
				return false;

		}

		//if the code passes the loop, it means there is not a point where numarray is increasing, meaning it is always going down
		return true;
	}

	//getValuesBiggerThanX will return an array that contains
	//count number of values that are larger than parameter x
	//[1,2,3,4,5,6,7,8,9,10,11,6],3,5  would return [6,7,8]
	public static int[] getCountValuesBiggerThanX(int[] numArray, int count, int x)
	{
		//placed is used to keep track of how many things are placed into the newArray
		int placed = 0;
		int[] newArray = new int[count];

		//prevent the amount of ints placed into the newArray from passing its max index
		for(int i=0; placed < count; i++)
		{
			//checks if the current value of the current array is bigger than x, if so it places the value into new array, and moves on to the next placement
			if (numArray[i]> x)
			{
				newArray[placed] = numArray[i];
				placed++;
			}
			
		}

		return newArray;
	}
}