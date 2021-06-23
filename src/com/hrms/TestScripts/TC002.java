package com.hrms.TestScripts;


import org.testng.annotations.Test;

import com.hrms.lib.General;

public class TC002 {
	@Test
	//public static void main(String[] args) {
	public void TC002()  {
		General obj =new General();
		obj.AddEmployee();
		obj.DeleteEmployee();
	}
}
