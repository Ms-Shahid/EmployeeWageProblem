package day_3_practice_problems.empWageComputation;

public class EmployeeWage {

	static int IS_FULL_TIME =1;
	static int Wage_Per_Hour = 20;
	static int IS_PRESENT_FULL =1;
	static int IS_PRESENT_HALF = 2;
	public static void main(String[] args) {
		
		int Full_Time_Work = 8;
		int Daily_Wage = 0;
		int Part_Time_Work = 4;
		double empCheck = Math.floor(Math.random() * 10) % 3;
		
		switch ((int)empCheck) {
		case 0:System.out.println("Employee is Present Full time");Daily_Wage = Wage_Per_Hour * Full_Time_Work;break;
		case 1:System.out.println("Employee is Present Part Time");Daily_Wage = Wage_Per_Hour * Part_Time_Work;break;
		default:System.out.println("Employee is Absent");
	}
		System.out.println("Daily Wage of Employee is " + Daily_Wage);
	}
}
