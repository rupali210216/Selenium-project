package com.ebanking.master;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class BranchNg extends Base  {
	@Test(dataProvider="Brdata")
	public void Branch(String Bname,String Bcity,String Bpin) throws Throwable{
		lb.BranchCreation(Bname,Bcity,Bpin);
	}
	@DataProvider
	public Object[][] Brdata(){
		Object[][] obj=new Object[3][3];
		
		obj[0][0]="Navalur12";
		obj[0][1]="padur";
		obj[0][2]="45221";
		
		obj[1][0]="chennai154";
		obj[1][1]="padur";
		obj[1][2]="23564";
		
		obj[2][0]="Navalur";
		obj[2][1]="futf";
		obj[2][2]="45255";
		
		return obj;
		
											
		
	}

}
