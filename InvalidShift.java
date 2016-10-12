/**
Mohammed Raza
CSC 162 - Lab6 # 4 (exception class 3)
*/

public class InvalidShift extends Exception
{



	public InvalidShift()
	{

		super("Error: Invalid shift");
	}

	public InvalidShift(String strMessage)
	{
		super(strMessage);
	}


}