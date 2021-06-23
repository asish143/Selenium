package javaExamples;
import java.util.Scanner;
public class Switch {
public static void main(String[] args) {
Scanner ab =new Scanner(System.in);
System.out.println("1 Add");
System.out.println("2 Sub");
System.out.println("3 Mul");
System.out.println("4 Div");
System.out.println("Enter First Number");
int a=ab.nextInt();
System.out.println("Enter Second Number");
int b=ab.nextInt();
System.out.println("Enter Your Choice");
int ch=ab.nextInt();
switch (ch) {
case 1:
	System.out.println(a+b);
	break;
	case 2:
		System.out.println(a-b); 
		break;
	case 3:
		System.out.println(a*b);
		break;
	case 4:
		System.out.println(a/b);
		break;
	default:
		System.out.println("invalid Choice");
}
	
}
}
