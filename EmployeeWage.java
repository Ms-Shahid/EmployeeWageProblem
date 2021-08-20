package day_3_practice_problems.empWageComputation;

public class EmployeeWage {

	public static final int IS_PRESENT_FULL = 1;
	public static final int IS_PRESENT_HALF = 2;
	static int Wage_Per_Hour = 20;
	static int max_days=20;
	public static void main(String[] args) {
		
		int Daily_Wage = 0;
		int Monthly_Wage = 0;
		int empHrs = 0;
		for (int day=0; day < max_days; day++){
	
			int empCheck = (int) Math.floor(Math.random() * 10) % 3;	
			switch (empCheck) {
				case IS_PRESENT_FULL: empHrs=8; System.out.println("----------");System.out.println("Employee is Present Full time");break;
				case IS_PRESENT_HALF:empHrs =4;System.out.println("----------");System.out.println("Employee is Present Part Time");break;
				default:System.out.println("Employee is Absent");
			}
			Daily_Wage = Wage_Per_Hour * empHrs;
			Monthly_Wage+= Daily_Wage;
			System.out.println("Daily Wage of Employee is " + Daily_Wage);
		}
		System.out.println("Monthly Wage of Employee is " + Monthly_Wage);
	}
}
