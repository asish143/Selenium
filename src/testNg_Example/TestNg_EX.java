package testNg_Example;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class TestNg_EX {
@BeforeClass
public void Login() {
	System.out.println("Log In Compleated");
}
@AfterClass
public void Logout() {
System.out.println("Log Out Compleated");
}
@Test
public void Add() {
	System.out.println("Employee Added SucessFully");
}
@Test
public void Delet() {
	System.out.println("Delete Employee SuCessFuly");
}
}
