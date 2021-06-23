package com.hrms.TestScripts;


import org.apache.log4j.xml.DOMConfigurator;
import org.testng.annotations.Test;

import com.hrms.lib.General;

public class TC001{
	@Test
//public static void main(String[] args)throws Exception {
	//Test Case Steps
	public void TC001(){
		DOMConfigurator.configure("Log4j.xml");
	General obj = new General();
	obj.openApplication();
obj.login();
	obj.logout();
	obj.closeApplication();
}
}
