package day_3_practice_problems.empWageComputation;

public class EmployeeWage {

	static int IS_FULL_TIME =1;
	static int Wage_Per_Hour = 20;
	public static void main(String[] args) {
		
		int Total_Hour = 8;
		int Daily_Wage = 0;
		double empCheck = Math.floor(Math.random() * 10) % 2;
		
		if (empCheck == IS_FULL_TIME) {
			Daily_Wage = Wage_Per_Hour * Total_Hour;
			System.out.println("Employee is Present");
			System.out.println("Daily Wage of Employee is " + Daily_Wage);
		}else {
			System.out.println("Employee is Absent");
			System.out.println("Daily Wage of Employee is " + Daily_Wage);
		}
	}
}
