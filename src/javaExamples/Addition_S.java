package javaExamples;
import java.util.Scanner;
public class Addition_S {
	public static void main(String[] args) {
		int a,b,c;
		System.out.println("Enter The value of a  &b");
		Scanner obj = new Scanner(System.in);
		a=obj.nextInt();
		b=obj.nextInt();
		c=a-b;
		System.out.println("Substraction of Two Number"+c);
	}

}
