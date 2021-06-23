package javaExamples;

public class Path {
	//instance value ();
	int b=20;
	double c=40.5;
	static int empid=200;
	public void m1() {
		//Dt Var VV();
		int a=10;
		System.out.println("M1 Executed");
		System.out.println(a);
	}
	public void m2() {
		System.out.println("M2 Executed");
		System.out.println(b);
		System.out.println(c);
	
	}
	public void m3() {
		System.out.println("M3 Executed");
		System.out.println(empid);
	}

public static void main(String args[]) {
	System.out.println("Main File Executed");
	//classname objectname = new classname ();
	Path b = new Path ();
	b.m1();
	b.m2();
	b.m3();
	
}
}
