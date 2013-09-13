class EmployeeTest
{
	public static void main (String [] args )
	{
	  Employee employee1 = new Employee ("Haroon", "khan", 314.15 );
	  Employee employee2 = new Employee ("Someone", "last", 233.24 );
		
	  System.out.println ( "Employee 1 is: ");
 	  System.out.println(employee1.getfirstname());
  	  System.out.println (employee1.getlastname());
	  System.out.println ( "Salary: ");

  	  System.out.println (employee1.getmonthlysalary()*12);

	  System.out.println ( "Employee 2 is:");
 	  System.out.println (employee2.getfirstname());
 	  System.out.println ( employee2.getlastname());
 	  System.out.println ( "Salary: ");
 	  System.out.println ( employee2.getmonthlysalary()*12);
	
	   System.out.println ( "After a 10% salary increase the final salaries are: ");
	   System.out.println (employee1.getfirstname() + " " + employee1.getmonthlysalary()*12*1.1);
	   System.out.println (employee2.getfirstname() + " " + employee2.getmonthlysalary()*12*1.1);
	}
	   
}


	

