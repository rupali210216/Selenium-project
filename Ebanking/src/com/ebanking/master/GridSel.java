package com.ebanking.master;

import java.net.URL;

import org.openqa.selenium.Platform;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.ebanking.master.pom.AdminHp;
import com.ebanking.master.pom.NewRole;
import com.ebanking.master.pom.Newbranch;
import com.ebanking.master.pom.RanfordHp;

public class GridSel {
	DesiredCapabilities cap =null;
	@Parameters("browser")
	@Test
	public void gd(String br) throws Throwable{
		if(br.equalsIgnoreCase("firefox"))
		{
			cap=new DesiredCapabilities();
			cap.setBrowserName("firefox");
			cap.setPlatform(Platform.WINDOWS);
		}else if(br.equalsIgnoreCase("chrome"))
		{
			cap=new DesiredCapabilities();
			cap.setBrowserName("chrome");
			cap.setPlatform(Platform.WINDOWS);
		}
			
		RemoteWebDriver driver= new RemoteWebDriver(new URL("http://192.168.43.214:4444/wd/hub"),cap);
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
