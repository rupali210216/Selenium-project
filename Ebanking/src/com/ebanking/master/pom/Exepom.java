package com.ebanking.master.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class Exepom {
	@Test
	public void pom(){
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("http://183.82.100.55/ranford2");
		
		RanfordHp Rhp=PageFactory.initElements(driver,RanfordHp.class);
		Rhp.login();
		
		AdminHp Ahp=PageFactory.initElements(driver, AdminHp.class);
		Ahp.br();
		
		Newbranch Nbr=PageFactory.initElements(driver, Newbranch.class);
		Nbr.branchcre();
		driver.switchTo().alert().accept();
		Ahp.Hm();
		
		Ahp.rol();
		NewRole Nro=PageFactory.initElements(driver, NewRole.class);
		Nro.Rolecre("clerk","vhkgv","E");
		driver.switchTo().alert().accept();
		
		
	}

}
