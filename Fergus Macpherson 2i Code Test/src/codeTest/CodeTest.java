package codeTest;

/**
 * Code Test --- A simple class that counts from a given starting value, multiplying the starting value by itself until it reaches a targetValue, it then starts again, adding one to the starting value
 * and multiplying the target value. It does this for a given number of loops.
 * This code assumes that it will be passed arguments on startup to tell it the starting and target values but also has commented out lines to allow for increasing the number of loops beyond 3.
 * It also assumes that the value of A will always be the starting value. 
 * @author Fergus Macpherson
 *
 */
public class CodeTest {

	public static void main (String[] args)
	{
		int startingValue = Integer.parseInt(args[0]) ; //The value for A
		int targetValue = Integer.parseInt(args[1]); //The value that we count up to
		//int maxLoops = Integer.parseInt(args[2]); //The number of times that we will loop(currently not used but included to allow for the addition down the line to allow for more than three loops)
		int totalLoops = 3; //the current value used instead of maxLoops. Using a different name here for clarity
		
		counter(startingValue, targetValue, totalLoops); //call and run the counter that will do the actual work.
	}
	
	/*
	 * counter --- takes the starting and target values, iterates over the starting value in multiples of itself until it reaches X. It will do this as many times as maxLoops specifies
	 * @param int a -- the starting value
	 * @param int x -- the target value
	 * @param int maxLoops -- the number of times to loop
	 */
	public static void counter(int a, int x, int maxLoops)
	{
		//Some text to let the user know what is happening
		System.out.println("Starting Count..."); 
		System.out.println("Counting from " + a + " to " + x + " " + maxLoops + " times");
		
		int countA = a; //this is the value that will actually be incremented for A
		int aMod = a; //this is the modified version of A that used for each following run. 
		int countX = x; //this is the value that will actually be incremented for X
		int multiplier = 2; //used to multiply the X
		//now we set up a for loop will count for three loops
		
		for(int i = 0; i < maxLoops; i++)
		{
			System.out.println("This is loop " + i);
			while(countA < countX) //a while loop that will run until A passes or matches X
			{
				System.out.println("A was at " + countA); //output to track
				countA = countA + (countA * aMod); //multiply countA by a
				System.out.println("A is currently at " + countA);
			}
			countX = countX * multiplier; //increase countX by countX multiplied by the multiplier
			multiplier++; //increment the multiplier by 1
			countA = a; //reset countA back to the start
			aMod = a++; //increase the value we are multiplying by by 1
		}
				
	}
}
