package com.hefshine.main;

import com.hefshine.config.Config;

public class MainClass extends Config {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MainClass obj=new MainClass();
		obj.browserSetting("file:///D:/SeleniumSoftware/Offline%20Website/pages/examples/users.html");
		obj.webtableAutomate();
		
	}

}
