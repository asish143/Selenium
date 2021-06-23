package javaExamples;

public class Dt_Var {
	int b=30; //instance variable
	static int empid=105;
	public void m1() {
		//DT var VV
		int a=10;
		System.out.println(a);
		System.out.println("M1 Executed");
	}
	public void m2() {
		System.out.println("M2 Executed");
		System.out.println(b);
		System.out.println(empid);
	}
	public void m3() {
		System.out.println("M3 Executed");
		System.out.println(b);
		System.out.println(empid);
	}
	public static void main(String args[]){
		System.out.println("Main Method Executed");
	//classname objectname= new objectname();
		Dt_Var m =new Dt_Var();
		m.m1();
		m.m2();
		m.m3();
		
	}
}
	