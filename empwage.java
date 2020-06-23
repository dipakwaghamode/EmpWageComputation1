public class empwage
{
	public static void main(String args[])
	{

		System.out.println("Welcome to EmpWageComputation");
	int isPresent=1;
	int isAbsent=0;
	double AttendanceCheck = Math.floor( Math.random() * 10) % 2;
	if ( AttendanceCheck == isPresent )
	System.out.println("Employee is present");
else
	System.out.println("Employee is Absent");


	}


}
