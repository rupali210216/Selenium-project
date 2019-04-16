package com.ebanking.master;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.sun.jna.platform.FileUtils;

public class Screenshots {
		public static   WebDriver driver;
		public static	String Expval,acctual,Retval;
		public static	FileInputStream Fis;
		public static	Properties pr;
		public void scr(WebDriver  driver ,String screenname)
		{
			File screen=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			FileUtils.copyFile(screen,new File("D:\\rupali\\src"+screenname+".jpj"));
			
		}
		public String Launchurl(String Url) throws IOException{
			Fis= new FileInputStream("F:\\rupali_workspace\\Ebanking\\src\\com\\ebanking\\properties\\Repository.properties");
			pr=new Properties();
			pr.load(Fis);
			
			String Expval="Ranford Bank";
			//launch Firefox
			driver=new FirefoxDriver();
			//maximize
			driver.manage().window().maximize();
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
	

}
