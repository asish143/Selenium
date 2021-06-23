package javaExamples;

public class Demo {
public void m1() {
	System.out.println("M1 Executed");
}
public void m2() {
	System.out.println("M2 Executed");
}
public void m3() {
	System.out.println("M3 Executed");
}
public static void main(String args[]) {
	System.out.println("Main Method Executed");
	//classname objectname = newclassname(""){}
	Demo b = new Demo();
		b.m1();
	b.m2();
	b.m3();
}
}
