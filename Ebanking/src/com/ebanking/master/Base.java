package com.ebanking.master;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;

import java.io.IOException;

import org.testng.annotations.AfterSuite;

public class Base {
	Library lb=new Library();
	 @BeforeTest
  public void Adminlogin() {
		 lb.Adminlogin("Admin","M1ndq");
  }

  @AfterTest
  public void Logout() {
	  lb.Logout();
  }

  @BeforeSuite
  public void Launchurl() throws IOException {
	  lb.Launchurl("http://183.82.100.55/ranford2");
  }

  @AfterSuite
  public void closeapp() {
	  lb.Close();
  }

}
