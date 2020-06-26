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

	double empCheck = Math.floor( Math.random() * 10) % 2;
	
	if ( empCheck == isPresent )
	{
	System.out.println("Employee is present");
	salary = wagePerHr * fullDayHrs;
	System.out.println("Daily Employee wage salary is: " +salary);
	}

	 int choice = (int)empCheck;

		switch(choice)
		{
			case 1:
				empHrs = 16;
				System.out.println("Employee Working full time.");
				break;
			case 2:
				empHrs = 8;
				System.out.println("Employee Working part time.");
				break;
			default:
				System.out.println("Employee is absent");
				break;
		}

		totalSalary = empHrs * empRate;
		System.out.println("Total Salary = "+totalSalary);
	}
	

}
