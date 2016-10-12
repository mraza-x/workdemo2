/**
Mohammed Raza
CSC 162 - Lab6 # 4 (exception class 2)
*/

public class InvalidPayRate extends Exception
{



	public InvalidPayRate()
	{

		super("Error: Invalid pay rate");
	}

	public InvalidPayRate(String strMessage)
	{
		super(strMessage);
	}


}