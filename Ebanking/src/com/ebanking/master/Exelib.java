package com.ebanking.master;

import java.io.IOException;

public class Exelib {
public static void main(String[] args) throws IOException, Throwable   {
		// TODO Auto-generated method stub
		Library lb=new Library();
  String Retval=lb.Launchurl("http://183.82.100.55/ranford2");
	System.out.println(Retval);
  String Retval1=lb.Adminlogin("Admin","M1ndq");
	System.out.println(Retval1);
  String Retval2=lb.BranchCreation("xhjfjhfg","padur","603106");
  System.out.println(Retval2);
  String Retval3=lb.Rolecreation("Clerk","xshd","");
  System.out.println(Retval3);
  lb.Employeecreation("Rupali","12345","","");
		lb.Logout();
		lb.Close();

	}

}
