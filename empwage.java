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
	int isParttime=0;
	int isFulltime=1;
	int totalSalary=0;
	int empRate=10;
	int empHrs=0;

	double AttendanceCheck = Math.floor( Math.random() * 10) % 2;
	
	if ( AttendanceCheck == isPresent )
	{
	System.out.println("Employee is present");
	salary = wagePerHr * fullDayHrs;
	System.out.println("Daily Employee wage salary is: " +salary);
	}

	if(AttendanceCheck == isFulltime)
		{
			empHrs = 16;
			System.out.println("Employee Working full time");
		}
		else if(AttendanceCheck == isParttime)
		{
			empHrs = 8;
			System.out.println("Employee is Present and its working part time ");
		}
		else
		{
			System.out.println("Employee is absent");
		}
		totalSalary = empHrs * empRate;
		System.out.println("Total Salary = "+totalSalary);
	}
	

}
