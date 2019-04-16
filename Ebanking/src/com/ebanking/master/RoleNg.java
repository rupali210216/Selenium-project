package com.ebanking.master;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class RoleNg extends Base {
	@Test(dataProvider="Rdata")
	public void Role(String Rn,String Rd,String Rt){
		lb.Rolecreation(Rn,Rd,Rt);
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

