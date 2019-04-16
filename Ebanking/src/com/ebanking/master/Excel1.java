package com.ebanking.master;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Excel1 {

	public static void main(String[] args) throws IOException {
		Library lb=new Library();
		  String Retval=lb.Launchurl("http://183.82.100.55/ranford2");
			System.out.println(Retval);
		  lb.Adminlogin("Admin","M1ndq");
		   FileInputStream Fis=new FileInputStream("D:\\rupali_workspace\\Ebanking\\src\\com\\ebanking\\testdata\\Role.xlsx");
		  //workbook
		  XSSFWorkbook WB=new XSSFWorkbook(Fis);
		  //Sheet
		  XSSFSheet WS=WB.getSheet("Role1");
		  //Row count
		  int rowcount=WS.getLastRowNum();
		  System.out.println(rowcount);
		  //for loop for multilple itteration
		  
		  for(int i=1;i<=rowcount;i++){
			  
			  //row
			  XSSFRow WR=WS.getRow(i);
			  //cell
			  XSSFCell WC=WR.getCell(0);
			  XSSFCell WC1=WR.getCell(1);
			  XSSFCell WC2=WR.getCell(2);
			  XSSFCell WC3=WR.createCell(3);
			//Cell Value
			  String RolName=WC.getStringCellValue();
			  String RollDesc=WC1.getStringCellValue();
			  String Rolltype=WC2.getStringCellValue();
			  String Result=lb.Rolecreation(RolName,RollDesc,Rolltype);
			  System.out.println(Result);
			  WC3.setCellValue(Result);
			   }
		  //Result
		  FileOutputStream Fos=new FileOutputStream("D:\\rupali_workspace\\Ebanking\\src\\com\\ebanking\\results\\Res_rol.xlsx");
		  WB.write(Fos);
		  WB.close();
	}

}
