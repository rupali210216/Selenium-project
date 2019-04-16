package com.rupali;

import com.sun.xml.internal.ws.api.server.WebServiceContextDelegate;

public class Maventest {

	public static void main(String[] args) {
	
		String Expval="Ranford Bank";
		//launch Firefox
		
		//maximize
		driver.manage().window().maximize();
		//url
		driver.get("http://183.82.100.55/ranford2");
	String acctual=driver.findElement(By.xpath("//*[@id='Form1']/table/tbody/tr/td/table/tbody/tr[4]/td/table/tbody/tr[1]/td[4]/p/span")).getText();
		if(Expval.equalsIgnoreCase(acctual))
		{
			System.out.println("Application is launched");	
		}else
		{
			System.out.println("Application is  not open");		
		}
		
		//adminlogin
		Expval="Welcome to Admin";
		driver.findElement(By.id("txtuId")).sendKeys("Admin");
		driver.findElement(By.id("txtPword")).sendKeys("M1ndq");
	    driver.findElement(By.xpath("*//input[@name='login']")).click();

	}

}
