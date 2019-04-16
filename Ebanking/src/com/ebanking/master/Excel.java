package com.ebanking.master;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

public class Excel {
//instance class
	@Test
     public void ddt() throws IOException, Throwable{
		Library lb=new Library();
		  String Retval=lb.Launchurl("http://183.82.100.55/ranford2");
			System.out.println(Retval);
		  lb.Adminlogin("Admin","M1ndq");
		  
		  //To get the Test data file
		  FileInputStream Fis=new FileInputStream("D:\\rupali_workspace\\Ebanking\\src\\com\\ebanking\\testdata\\Branch.xlsx");
		  // workbook
		  XSSFWorkbook WB = new XSSFWorkbook(Fis);
		  //sheet
		  
		  XSSFSheet WS=WB.getSheet("Sheet1");
		  //Rowcount
		  
		  int Rcount= WS.getLastRowNum();
		  System.out.println(Rcount);
		
		  //multiple ittertation for loop
		 
		  for(int i=1;i<=Rcount;i++){
			 //Row 
			  XSSFRow WR=WS.getRow(i);
			//Column
			  XSSFCell WC=WR.getCell(0);
			  XSSFCell WC1=WR.getCell(1);
			  XSSFCell WC2=WR.getCell(2);
			  XSSFCell WC3=WR.createCell(3);
			  
			 //Cell value
			  String Name=WC.getStringCellValue();                                                                              
			  String Address=WC1.getStringCellValue();
			  String pin= WC2.getStringCellValue();                                                                                                                    
			  
			  String Result=lb.BranchCreation( Name, Address, pin);
			  System.out.println(Result);
			  WC3.setCellValue(Result);
			}
		  //Result
		  FileOutputStream Fos=new FileOutputStream("D:\\rupali_workspace\\Ebanking\\src\\com\\ebanking\\results\\Res_branch.xlsx");
		  WB.write(Fos);
		  WB.close();
	}
}
