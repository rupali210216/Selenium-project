package com.ebanking.master.pom;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class NewRole {
	//element properties
	@FindBy(xpath=".//*[@id='btnRoles']")
	WebElement newrol;
	@FindBy(xpath="//*[@name='txtRname']")
	WebElement Rolname;
	@FindBy(xpath="//*[@name='txtRDesc']")
	WebElement Roldesc;
	@FindBy(xpath="//*[@id='lstRtypeN']")
	WebElement Roltype;
	@FindBy(xpath="//*[@id='btninsert']")
	WebElement Rsubmit;
	
	//method
	public void Rolecre(String rname, String rdesc,String rtype){
		newrol.click();
	Rolname.sendKeys(rname);
	Roldesc.sendKeys(rdesc);
	Roltype.click();
	Roltype.sendKeys(rtype);
		
		Rsubmit.click();
	}
	

}
