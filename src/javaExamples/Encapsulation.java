package javaExamples;
public class Encapsulation {
private	String Name="Asish";
private int age = 26;
	public void add() {
		System.out.println("Helo My name Is" +Name);
		System.out.println("My age is" +age);
	}		
	public static void main(String[] args) {
		Encapsulation S =new Encapsulation();
		S.add();
	}
			
}

