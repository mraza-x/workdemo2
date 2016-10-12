import java.util.*;

/**
  Mohammed Raza
  CSC 162 - Lab6 #4 (main)
*/

public class WorkerDemo
{
   public static void main(String[] args)
   {

	  Scanner console = new Scanner(System.in);

	  	   String name;
	  	   int id = 0;
	  	   String date;
	  	   int shift = 0;
	  	   double pay = 0.0;

	  	   boolean done;
	  	   String str = " ";
	  	   String str1 = " ";
	  	   String str2 = " ";

	  	   done = false;



	  	   System.out.print("Name: ");
	  	   name = console.nextLine();

	  	   do
	  	   {
	  		   try
	  		   {

	  	   			System.out.print("Employee Number: ");
	  	   			id = console.nextInt();

	  	   			done = true;

	  	   			if (id < 0 || id > 9999)

	  	   				throw new InvalidEmployeeNumber();

	  			}


	  		    catch (InvalidEmployeeNumber ref1)
	  		    {

	  				System.out.println("Error: " + ref1.toString());
	  				System.out.print("Invalid Employee Number: ");

	  			}

	  		} while (!done);



	  		System.out.print("Hire Date: ");
	  		date = console.nextLine();



	  	   do
	  	   {
	  		   try
	  		   {

	  	   			System.out.print("Shift: ");
	  	   			shift = console.nextInt();

	  	   			done = true;

	  	   			if (shift == 1)

	  	   				str = "Day Shift";

	  	   			else if (shift == 2)

	  	   				str = "Night Shift";

	  	   			else if (shift != 1 || shift != 2)

						throw new InvalidShift();

	  			}


	  		    catch (InvalidShift ref2)
	  		    {


	  				System.out.println("Error: " + ref2.toString());
	  				System.out.print("Invalid Shift ");

	  			}

	  		} while (!done);





	  			  	   do
				  	   {
				  		   try
				  		   {

				  	   			System.out.print("Pay Rate: $");
				  	   			pay = console.nextDouble();

				  	   			done = true;

				  	   			if (pay < 0.0)

									throw new InvalidPayRate();

				  			}


				  		    catch (InvalidPayRate ref3)
				  		    {


				  				System.out.println("Error: " + ref3.toString());
				  				System.out.print("Invalid Pay Rate ");

				  			}

	  		} while (!done);



	  		System.out.println(" ");
	  		System.out.println(" ");

	  		System.out.println("Name: " + name);
	  	    System.out.println("Employee Number: " + id);
	  		System.out.println("Hire Date: " + date);
	  		System.out.println("Shift: " + str);
	  		System.out.println("Pay Rate: $" + pay);


	     }
	  }
