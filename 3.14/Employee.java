
public class Employee
   {
		private String firstname;
		private String lastname;
		private double monthlysalary;

	public Employee( String fname, String lname, double salary)
	{	
		firstname = fname;
		lastname = lname;
		monthlysalary = salary;
	}

	
//	public void setfirstname( String fname )
//	{
//		firstname = fname;
//	}
	
	public String getfirstname ()
	{
		return firstname;
	}
	
	public void setfirstname( String lname )
	{
		lastname = lname;
	}
	

	
	public String getlastname ()
	{
		return lastname;
	}


	public void setfirstname( double salary )
	{
		if ( monthlysalary >= 0.00 )
		monthlysalary = salary;
	}
			
	
	public double getmonthlysalary()
	{
		return monthlysalary;
	}
 }

 