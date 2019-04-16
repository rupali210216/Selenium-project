package com.ebanking.master;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class EmployeeNg extends Base {
	@Test(dataProvider="Edetails")
	public void Employee(String Ename,String Epas,String Erol,String Ebr ){
		lb.Employeecreation(Ename,Epas,Erol,Ebr);
	}
	@DataProvider
	public Object[][] Edetails(){
		Object[][] obj=new Object[2][4];
		
		obj[0][0]="Rupali";
		obj[0][1]="12345";
		obj[0][2]="testIT";
		obj[0][3]="abc";
		
		obj[1][0]="Rupali1";
		obj[1][1]="12555";
		obj[1][2]="testIT";
		obj[1][3]="abc";
		
		return obj;
	}

}
