package com.ebanking.master;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

import com.sun.jna.platform.FileUtils;

public class Library {
	public static   WebDriver driver;
	public static	String Expval,acctual,Retval;
	public static	FileInputStream Fis;
	public static	Properties pr;
	public String Launchurl(String Url) throws IOException{
		Fis= new FileInputStream("F:\\rupali_workspace\\Ebanking\\src\\com\\ebanking\\properties\\Repository.properties");
		pr=new Properties();
		pr.load(Fis);
		
		String Expval="Ranford Bank";
		//launch Firefox
		driver=new FirefoxDriver();
		//maximize
		driver.manage().window().maximize();
		scr(driver,"rupali");
		//url
		driver.get(Url);
	String acctual=driver.findElement(By.xpath("//*[@id='Form1']/table/tbody/tr/td/table/tbody/tr[4]/td/table/tbody/tr[1]/td[4]/p/span")).getText();
		if(Expval.equalsIgnoreCase(acctual))
		{
			System.out.println("Application is launched");	
		}else
		{
			System.out.println("Application is  not open");		
		}
	 return Retval="";	
 }
	public void scr(WebDriver  driver ,String screenname)
	{
		File screen=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(screen,new File("D:\\rupali\\src"+screenname+".jpg"));
		
	}
	public String Adminlogin(String Uid,String Pwd){
		Expval="Welcome to Admin";
		driver.findElement(By.id(pr.getProperty("Uname"))).sendKeys(Uid);
		driver.findElement(By.id(pr.getProperty("Pass"))).sendKeys(Pwd);
	    driver.findElement(By.xpath(pr.getProperty("Lgn"))).click();
	    //compare
	    acctual=driver.findElement(By.xpath("html/body/table/tbody/tr/td/table/tbody/tr[4]/td/table/tbody/tr[1]/td[4]/strong/font/font")).getText();
	    if(Expval.equalsIgnoreCase(acctual)){
	    	System.out.println("Admin login sucessfully");
	    	 }
	    else{
	    	System.out.println("Admin is not login ");
	    }
	    return Retval="";
	}
	public String BranchCreation(String Tname,String Add,String pin) throws InterruptedException{
		Expval="Sucessfully";
	    driver.findElement(By.xpath(pr.getProperty("Bbutton"))).click();
		driver.findElement(By.xpath(pr.getProperty("Nbbutton"))).click();
		driver.findElement(By.xpath(pr.getProperty("Txtname"))).sendKeys(Tname);
		driver.findElement(By.xpath(pr.getProperty("Address"))).sendKeys(Add);
		driver.findElement(By.xpath(pr.getProperty("Pin"))).sendKeys(pin);
		WebElement e = driver.findElement(By.name(pr.getProperty("Cntry")));
	     Select ctry = new Select(e);
	     ctry.selectByVisibleText("INDIA");
	     Thread.sleep(3000);
	     WebElement e1 = driver.findElement(By.xpath(pr.getProperty("Stat")));
	     Select state = new Select(e1);
	     state.selectByVisibleText("Tamil Nadu");
	     Thread.sleep(3000);
	     driver.findElement(By.xpath(pr.getProperty("Area"))).sendKeys("navalur");
	     WebElement e3= driver.findElement(By.name(pr.getProperty("City")));
	     Select city =new Select(e3);
	     city.selectByIndex(1);
	     Thread.sleep(3000);
	     driver.findElement(By.xpath(pr.getProperty("Bsubmitbtn"))).click();
	     //alret
	  acctual= driver.switchTo().alert().getText();
	  driver.switchTo().alert().accept();
	  if(acctual.contains(Expval)){
		  System.out.println("new branch created sucessfully");
	  }else{
		  System.out.println("Branch already exist");
		   }
	  return Retval="";
	  }
	public String Rolecreation(String Name,String Desc,String Type){
		Expval="Sucessfully";
	     driver.findElement(By.xpath(pr.getProperty("Rlbutton"))).click();
	     driver.findElement(By.xpath(pr.getProperty("Nrobutton"))).click();
	     driver.findElement(By.xpath(pr.getProperty("Roname"))).sendKeys(Name);
	     driver.findElement(By.xpath(pr.getProperty("Rdesc"))).sendKeys(Desc);
	     WebElement e4=driver.findElement(By.xpath(pr.getProperty("Rtype")));
	     Select role=new Select(e4);
	     role.selectByIndex(1);
       driver.findElement(By.xpath(pr.getProperty("Rosubmit"))).click();
      acctual= driver.switchTo().alert().getText();
       driver.switchTo().alert().accept();
       if(acctual.contains(Expval)){
 		  System.out.println("new role created sucessfully");
 	  }else{
 		  System.out.println("roleno. already exist");
 		  }
       return Retval="pass";
		}
	public String Employeecreation(String Uname,String Pass,String ERole,String Ebranch){
		  Expval="Employer";
	        driver.findElement(By.xpath(pr.getProperty("Empbutton"))).click();
	        driver.findElement(By.xpath(pr.getProperty("Nempbutton"))).click();
	        driver.findElement(By.xpath(pr.getProperty("EmpName"))).sendKeys(Uname);
	        driver.findElement(By.xpath(pr.getProperty("Emppass"))).sendKeys(Pass);
	        WebElement e5=driver.findElement(By.xpath(pr.getProperty("EmpRole")));
	        Select s=new Select(e5);
	        s.selectByValue("testIT");
	        WebElement e6=driver.findElement(By.xpath(pr.getProperty("EmpBranch")));
	        Select s1=new Select(e6);
	        s1.selectByVisibleText("abc");
	        driver.findElement(By.xpath(pr.getProperty("Empsubmit"))).click();
	        acctual=driver.switchTo().alert().getText();
	        driver.switchTo().alert().accept();
	        if(acctual.contains(Expval)){
	    		  System.out.println("new employer created sucessfully");
	    	  }else{
	    		  System.out.println("employee no. already exist");
	    		  
	    	  }
	        return "pass";
		}
    public void Logout(){
    	driver.findElement(By.xpath(pr.getProperty("Logout"))).click();
    	
    	 }
	
   public void Close(){
	   driver.close();
   }

	}


