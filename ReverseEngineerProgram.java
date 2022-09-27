package Assignments;

import java.util.Scanner;
//import java.util.function.BinaryOperator;

public class ReverseEngineerProgram {

	// private static final String T = null;
	static int wholenumber;
	static int entryone;
	static int entrytwo;
	static int entrythree;
	static int entryfour;
	static String[] operatos = { "(", "+", "-", "*", "/", ")" };
	static String operatorss;

	public static void main(String[] args) {
		ReverseEngineerProgram value = new ReverseEngineerProgram();
		System.out.println("Enter the whole number : ");

		Scanner sc = new Scanner(System.in);
		wholenumber = sc.nextInt();
		System.out.println("There are four Entries you to choose!");
		System.out.println("choose the first entry value ");
		entryone = sc.nextInt();
		System.out.println("choose the second entry value ");
		entrytwo = sc.nextInt();
		System.out.println("choose the Third entry value ");
		entrythree = sc.nextInt();
		System.out.println("choose the fourth entry value ");
		entryfour = sc.nextInt();

		if (ReverseEngineerProgram.wholenumber > 0) {
			System.out.print("choose the operators( * / + -  )to get the wholenumber ");

			operatorss = sc.next();
			if (ReverseEngineerProgram.wholenumber / 2 == 0 && wholenumber % 2 == 0) {

				System.out.println("Hint:! choose only + - * for your option");
			}
		}

		for (int i = 1; i <= 1; i++) {
			int result = entryfour + entrytwo - entrythree - entryone;
			int result2 = entryone + entrytwo + entryfour + entrythree;
			int result3 = entrytwo + entryone + entryfour + entrythree;
			int result4 = entryfour + entryone + entrytwo + entrythree;
			int result5 = entrythree + entryone + entrytwo + entryfour;
//System.out.println(wholenumber+"="+entryone+operatorss);
			System.out.println(wholenumber + "=" + entryfour + "+" + entrytwo + "-" + entrythree + "-" + entryone);
//System.out.println(result);
			System.out.println(result2 + "=" + entryone + "+" + entrytwo + "+" + entryfour + "+" + entrythree);
			System.out.println(result3 + "=" + entrytwo + "+" + entryone + "+" + entryfour + "+" + entrythree);
			System.out.println(result4 + "=" + entryfour + "+" + entryone + "+" + entrytwo + "+" + entrythree);
			System.out.println(result5 + "=" + entrythree + "+" + entryone + "+" + entrytwo + "+" + entryfour);

		}
	}
}
