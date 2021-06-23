package com.hrms.lib;

import org.openqa.selenium.WebDriver;

public class Global {
	public WebDriver driver;
	//Test DAta
	public String url="http://127.0.0.1/orangehrm-2.6/login.php";
	public String un = "admin";
	public String pw  = "admin";
	public String FN= "Babu";
	public String LN ="Behera";
	//Objects
	public String txt_loginname="txtUserName";
	public String txt_Password="txtPassword";
	public String btn_login="Submit";
	public String link_logout="Logout";
	public String btn_add="Add";
	public String btn_delete="Delete";
	
	
}
