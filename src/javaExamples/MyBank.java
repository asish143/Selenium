package javaExamples;
abstract class Bank {
	abstract void credit();
	abstract void debit();
}
 class HDFC extends Bank{
	void credit() {
		System.out.println("Amount credit from HDFC");
	}
	void debit() {
		System.out.println("Amount Debited From HDFC");
	}
}
 class ICICI extends Bank{
	void credit() {
		 System.out.println("Amount credit from ICICI");
	 }
void debit() {
		 System.out.println("Amount debit From ICICI");
	 }
 }

public class MyBank {
public static void main(String[] args) {
	HDFC h=new HDFC();
	h.credit();
	h.debit();
	ICICI i=new ICICI();
	i.credit();
	i.debit();
}
}
