package javaExamples;
public class OverRide1 extends OverRide{
public void add(int a, int b) {
	System.out.println(a-b);
}
public static void main (String args[]) {
	OverRide1 obj=new OverRide1();
	obj.add(10, 20);
	OverRide1 obj1= new OverRide1();
	obj1.add(50, 30);
	
}
}
