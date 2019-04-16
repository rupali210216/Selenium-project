package com.ebanking.master;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Action {

	public static void main(String[] args) throws Throwable {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\User\\Desktop\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.amazon.com");
		driver.findElement(By.xpath(".//*[@id='nav-link-shopall']/span[2]")).click();
	
        Thread.sleep(5000);
        Actions act=new Actions(driver);
        act.moveToElement(driver.findElement(By.xpath(".//*[@id='nav-link-shopall']/span[2]"))).build().perform();
        Thread.sleep(5000);
        act.moveToElement(driver.findElement(By.xpath(".//*[@id='nav-flyout-shopAll']/div[2]/span[6]/span"))).build().perform();
        Thread.sleep(5000);
        act.moveToElement(driver.findElement(By.xpath(".//*[@id='nav-flyout-shopAll']/div[3]/div[6]/div[1]/div/a[5]/span"))).build().perform();
        Thread.sleep(5000);
        driver.findElement(By.xpath(".//*[@id='nav-flyout-shopAll']/div[3]/div[6]/div[1]/div/a[5]/span")).click();
        driver.findElement(By.xpath(".//*[@id='nav-flyout-shopAll']/div[3]/div[6]/div[1]/div/a[1]/span[1]")).click();
		
	}

}
