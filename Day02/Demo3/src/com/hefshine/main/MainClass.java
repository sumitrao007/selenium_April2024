package com.hefshine.main;

import com.hefshine.config.MyConfig;

public class MainClass extends MyConfig {
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MainClass obj=new MainClass();
		obj.browserSetting("file:///D:/SeleniumSoftware/Offline%20Website/index.html");
		obj.login();
		obj.showAddUser();
		obj.fillAddUserDetails();
		
		
		
	}

}
