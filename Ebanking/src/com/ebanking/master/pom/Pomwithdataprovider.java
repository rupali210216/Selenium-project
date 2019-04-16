package com.ebanking.master.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.server.browserlaunchers.Sleeper;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Pomwithdataprovider {
	WebDriver driver;
	@BeforeTest
	public void login(){
	  driver=new FirefoxDriver();
	  driver.manage().window().maximize();
		driver.get("http://183.82.100.55/ranford2");
		RanfordHp Rhp=PageFactory.initElements(driver,RanfordHp.class);
		Rhp.login();
	}
	@Test(dataProvider="Rdata")
	public void Rolecre(String Rolname,String Roldesc,String Roltype){
		Sleeper.sleepTightInSeconds(5);
		AdminHp Ahp=PageFactory.initElements(driver, AdminHp.class);
		Ahp.rol();
		NewRole Nro=PageFactory.initElements(driver, NewRole.class);
		Nro.Rolecre(Rolname,Roldesc,Roltype);
		Sleeper.sleepTightInSeconds(5);
		driver.switchTo().alert().accept();
		Sleeper.sleepTightInSeconds(3);
		
	}
	@DataProvider
	public Object[][] Rdata()
	{
		Object[][] obj =new Object[3][3];
		obj[0][0]="Clreck";
		obj[0][1]="fhgjhfg";
		obj[0][2]="E";
		
		obj[1][0]="manager";
		obj[1][1]="gcjjkg";
		obj[1][2]="C";
		
		obj[2][0]="manager";
		obj[2][1]="gcjjkg";
		obj[2][2]="C";
		
		
		return obj;
	}
}
