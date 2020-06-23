public class empwage
{

//		System.out.println("Welcome to EmpWageComputation");

	int wages=0;
	int fulltime=8;
	int wage_per_hr=20;
public int calculatewage(int fulltime, int wage_per_hr){
	int wage = wage_per_hr * fulltime;
	return wage;
}

	public static void main(String args[])
	{
	empwage Employeewage = new  empwage();
	System.out.println("Employee wage : " + Employeewage.calculatewage(Employeewage.fulltime , Employeewage.wage_per_hr));



	}


}
