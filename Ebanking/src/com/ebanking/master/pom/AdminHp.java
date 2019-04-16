package com.ebanking.master.pom;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AdminHp {
	//Element properties
	@FindBy(xpath= ".//*[@id='Table_01']/tbody/tr[2]/td/table/tbody/tr[2]/td/a/img")
	WebElement Branch;
	@FindBy(xpath= "//*[@src='images/Roles_but.jpg']")
    WebElement Rol;
	@FindBy(xpath="//*[@src='images/emp_btn.jpg']")
	WebElement Employee;
	@FindBy(xpath=".//*[@id='Table_01']/tbody/tr/td[1]/a/img")
	WebElement Home;
	//@FindBy(xpath="//*[@id='Table_01']/tbody/tr/td[3]/a/img")
	//WebElement logout;
	
	//methods
	
	public void br(){
		Branch.click();
	}
	public void rol(){
		Rol.click();
	}
	public void Emp(){
		Employee.click();
	}
	public void Hm(){
		Home.click();
	}
}

