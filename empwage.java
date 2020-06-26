public class empwage
{
	public static void main(String args[])
	{

		System.out.println("Welcome to EmpWageComputation");
	int isPresent=1;
	int isAbsent=0;
	int salary=0;
	int wagePerHr=20;
	int fullDayHrs=8;

	double AttendanceCheck = Math.floor( Math.random() * 10) % 2;
	
	if ( AttendanceCheck == isPresent )
	{
	System.out.println("Employee is present");
	salary = wagePerHr * fullDayHrs;
	}
else
	{
	System.out.println("Employee is Absent");
	}
	System.out.println("Daily Employee wage salary is: " +salary);
	}


}
