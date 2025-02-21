import java.util.Scanner;
public class Salary {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double salary = sc.nextDouble();
		int bonus = 0;
		if(salary > 10000) bonus = 2000;
		else bonus = 1000;
		salary += bonus;
		System.out.print(salary);
	}
}