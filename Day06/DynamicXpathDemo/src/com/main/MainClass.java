package com.main;

import com.config.Config;

public class MainClass extends Config {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MainClass obj=new MainClass();
		//obj.browserSetting("https://www.w3schools.com/");
		obj.browserSetting("https://register.rediff.com/register/register.php?FormName=user_details");
		//obj.accessElement();
		obj.rediffmailAccess();

	}

}
