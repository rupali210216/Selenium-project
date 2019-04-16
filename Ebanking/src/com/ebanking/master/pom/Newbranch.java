package com.ebanking.master.pom;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Newbranch {
         //Element properties
	@FindBy(xpath="//input[@name='BtnNewBR']")
	WebElement Newbr;
	@FindBy(xpath="//input[@name='txtbName']")
	WebElement Txtname;
	@FindBy(xpath="//input[@name='txtAdd1']")
	WebElement Add;
	@FindBy(xpath="//input[@name='txtZip']")
	WebElement pin;
	@FindBy(name="lst_counrtyU")
	WebElement ctry;
	@FindBy(xpath="//*[@name='lst_stateI']")
	WebElement stat;
	@FindBy(xpath="//input[@name='txtArea']")
	WebElement Area;
	@FindBy(name="lst_cityI")
	WebElement city;
	@FindBy(xpath="//*[@name='btn_insert']")
	WebElement submit;
	public void branchcre(){
		Newbr.click();
		Txtname.sendKeys("gashdmjf");
		Add.sendKeys("djgk");
		pin.sendKeys("14563");
		ctry.sendKeys("INDIA");
		stat.click();
		Area.sendKeys("dryhjf");
		city.click();
		submit.click();
	}
	
}
