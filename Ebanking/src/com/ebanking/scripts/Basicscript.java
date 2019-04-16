package com.ebanking.scripts;

import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Basicscript {
	
public static void main(String[] args) throws Throwable
{
		String Expval="Ranford Bank";
		//launch Firefox
		WebDriver driver=new FirefoxDriver();
		//maximize
		driver.manage().window().maximize();
		//url
		driver.get("http://183.82.100.55/ranford2");
	String acctual=driver.findElement(By.xpath("//*[@id='Form1']/table/tbody/tr/td/table/tbody/tr[4]/td/table/tbody/tr[1]/td[4]/p/span")).getText();
		if(Expval.equalsIgnoreCase(acctual))
		{
			System.out.println("Application is launched");	
		}else
		{
			System.out.println("Application is  not open");		
		}
		
		//adminlogin
		Expval="Welcome to Admin";
		driver.findElement(By.id("txtuId")).sendKeys("Admin");
		driver.findElement(By.id("txtPword")).sendKeys("M1ndq");
	    driver.findElement(By.xpath("*//input[@name='login']")).click();
	    //compare
	    acctual=driver.findElement(By.xpath("html/body/table/tbody/tr/td/table/tbody/tr[4]/td/table/tbody/tr[1]/td[4]/strong/font/font")).getText();
	    if(Expval.equalsIgnoreCase(acctual)){
	    	System.out.println("Admin login sucessfully");
	    	 }
	    else{
	    	System.out.println("Admin is not login ");
	    }
	    //branches
	    Expval="Sucessfully";
	    driver.findElement(By.xpath("//*[contains(@src,'images/Branches_but.jpg')]")).click();
		driver.findElement(By.xpath("//input[@name='BtnNewBR']")).click();
		driver.findElement(By.xpath("//input[@name='txtbName']")).sendKeys("xhjfjhfg");
		driver.findElement(By.xpath("//input[@name='txtAdd1']")).sendKeys("padur");
		driver.findElement(By.xpath("//input[@name='txtZip']")).sendKeys("603106");
		WebElement e = driver.findElement(By.name("lst_counrtyU"));
	     Select ctry = new Select(e);
	     ctry.selectByVisibleText("INDIA");
	   Thread.sleep(5000);
	     WebElement e1 = driver.findElement(By.xpath("//*[@name='lst_stateI']"));
	     Select state = new Select(e1);
	     state.selectByVisibleText("Tamil Nadu");
	     Thread.sleep(5000);
	     driver.findElement(By.xpath("//input[@name='txtArea']")).sendKeys("navalur");
	     WebElement e3= driver.findElement(By.name("lst_cityI"));
	     Select city =new Select(e3);
	     city.selectByIndex(1);
	     Thread.sleep(5000);
	     driver.findElement(By.xpath("//*[@name='btn_insert']")).click();
	     //alret
	  acctual= driver.switchTo().alert().getText();
	  driver.switchTo().alert().accept();
	  if(acctual.contains(Expval)){
		  System.out.println("new branch created sucessfully");
	  }else{
		  System.out.println("Branch already exist");
		  
	  }
	     //roles
	    Expval="Sucessfully";
	     driver.findElement(By.xpath("//*[@src='images/Roles_but.jpg']")).click();
	     Thread.sleep(5000);
	     driver.findElement(By.xpath("//*[@name='btnRoles']")).click();
	     driver.findElement(By.xpath("//*[@name='txtRname']")).sendKeys("Clerk");
	     driver.findElement(By.xpath("//*[@name='txtRDesc']")).sendKeys("xshd");
	     Thread.sleep(5000);
	     WebElement e4=driver.findElement(By.xpath("//*[@id='lstRtypeN']"));
	     Select role=new Select(e4);
	     role.selectByIndex(1);
        driver.findElement(By.xpath("//*[@id='btninsert']")).click();
       acctual= driver.switchTo().alert().getText();
        driver.switchTo().alert().accept();
        if(acctual.contains(Expval)){
  		  System.out.println("new role created sucessfully");
  	  }else{
  		  System.out.println("roleno. already exist");
  		  
  	  }
        
        //Employee
        Expval="Employer";
        Thread.sleep(5000);
        driver.findElement(By.xpath("//*[@src='images/emp_btn.jpg']")).click();
        Thread.sleep(5000);
        driver.findElement(By.xpath("//*[@src='images/New%20Emp.jpg']")).click();
        driver.findElement(By.xpath("//*[@name='txtUname']")).sendKeys("Rupali");
        driver.findElement(By.xpath("//*[@name='txtLpwd']")).sendKeys("12345");
        Thread.sleep(5000);
        WebElement e5=driver.findElement(By.xpath("//*[@name='lst_Roles']"));
        Select s=new Select(e5);
        Thread.sleep(5000);
        s.selectByValue("testIT");
        WebElement e6=driver.findElement(By.xpath("//*[@name='lst_Branch']"));
        Select s1=new Select(e6);
        s1.selectByVisibleText("abc");
        driver.findElement(By.xpath("//*[@name='BtnSubmit']")).click();
        acctual=driver.switchTo().alert().getText();
        driver.switchTo().alert().accept();
        if(acctual.contains(Expval)){
    		  System.out.println("new employer created sucessfully");
    	  }else{
    		  System.out.println("employee no. already exist");
    		  
    	  }
	}

}

