package day_3_practice_problems.empWageComputation;

public class EmployeeWage {

	static int IS_FULL_TIME =1;
	public static void main(String[] args) {
		
		int empCheck = (int) Math.floor(Math.random() * 10) % 2;
		
		if (empCheck == IS_FULL_TIME) {
			System.out.println("Employee is Present");
		}else {
			System.out.println("Employee is Absent");
		}		
	}
}
