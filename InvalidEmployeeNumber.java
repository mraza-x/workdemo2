/**
Mohammed Raza
CSC 162 - Lab6 # 4 (exception class 1)
*/

public class InvalidEmployeeNumber extends Exception
{



	public InvalidEmployeeNumber()
	{

		super("Error: Invalid employee number");
	}

	public InvalidEmployeeNumber(String strMessage)
	{
		super(strMessage);
	}


}
