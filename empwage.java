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
	int totalSalary=0,totalDays=20;
	int empRate=10,empHrs=0;


	int empCheck = (int)Math.floor( Math.random() * 10) % 2;

	if ( empCheck == isPresent )
	{
	System.out.println("Employee is present");
	salary = wagePerHr * fullDayHrs;
	System.out.println("Daily Employee wage salary is: " +salary);
	}

	 for(int day=1; day<=totalDays;day++)
		{
			switch(empCheck)
			{
				case 1:
					empHrs = 16;
					break;
				case 2:
					empHrs = 8;
					break;
				default:
					empHrs = 0;
					break;
			}

		 	salary = empHrs * empRate;
			totalSalary = totalSalary + salary + salary;
		}

		if(empCheck == 0)
		{
			System.out.println("Employee Working part time");
			System.out.println("Total Salary = "+totalSalary);
		}
		else
		{
			System.out.println("Employee Working full time");
		System.out.println("Total Salary = "+totalSalary);
		}
	}

}
