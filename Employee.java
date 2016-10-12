/**
Mohammed Raza
CSC 162 - Lab6 # 4 (class1)
*/

public class Employee
{
   public String name;
   public int id;
   public String date;

   public Employee()
   {
	   name = " ";
	   id = 0;
	   date = " ";
   }

   public Employee(String n, int i, String d)
   {
	  name = n;
	  id = i;
	  date = d;
   }


   public void setName(String n)
   {
      name = n;
   }


   public void setEmployeeNumber(int i)
   {
      id = i;

   }

   public void setHireDate(String d)
   {
      date = d;
   }



   public String getName()
   {
      return name;
   }



   public int getEmployeeNumber()
   {
      return id;
   }


   public String getHireDate()
   {
      return date;
   }


   public void isValidEmpNum()
   {

   }

   public String toString()
   {
	   String str = " ";
	   return str;
   }


}
