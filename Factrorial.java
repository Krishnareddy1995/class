package javaPack;

import java.util.Scanner;

public class Factrorial {

	public static void main(String[] args) {
	Scanner scan= new Scanner(System.in);
	System.out.println("Enter number");
	int  ss=scan.nextInt();
	int fact=1;
	
	for(int i=1;i<=ss;i++) {
		
		fact=fact*i;
	}
System.out.println(fact);
System.out.println(fact);
}
}