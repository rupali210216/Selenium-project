package com.ebanking.master.pom;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class RanfordHp {
	
	//element properties
	@FindBy(id="txtuId")
	WebElement Uname;
	
	@FindBy(id="txtPword")
	WebElement Pwd;
	
	@FindBy(xpath="*//input[@name='login']")
	WebElement lgn;
	
	//Element method
	public void login(){
		Uname.sendKeys("Admin");
		Pwd.sendKeys("M1ndq");
		lgn.click();
	}

}
