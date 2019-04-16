package com.ebanking.master;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Excel2 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		Library lb=new Library();
		  String Retval=lb.Launchurl("http://183.82.100.55/ranford2");
			System.out.println(Retval);
		                lb.Adminlogin("Admin","M1ndq");
		    FileInputStream Fis=new FileInputStream("D:\\rupali_workspace\\Ebanking\\src\\com\\ebanking\\testdata\\Employee.xlsx"); 
		    XSSFWorkbook WB=new XSSFWorkbook(Fis);
		    XSSFSheet WS=WB.getSheet("Emp.Data");
       int RCount=WS.getLastRowNum();
       System.out.println(RCount);
       
       //for multiple ittiration
       for(int i=1;i<=RCount;i++){
    	   XSSFRow RW=WS.getRow(i);
    	   //cell
    	    XSSFCell WC=RW.getCell(0);
    	    XSSFCell WC1=RW.getCell(1);
    	    XSSFCell WC2=RW.getCell(2);
    	    XSSFCell WC3=RW.getCell(3);
    	    XSSFCell WC4=RW.createCell(4);
    	    //cellvalue
    	    String EmpName=WC.getStringCellValue();
    	    String EmpPass=WC1.getStringCellValue();
    	    String EmpRole=WC2.getStringCellValue();
    	    String EmpBranch=WC3.getStringCellValue();
    	    String Result= lb.Employeecreation(EmpName,EmpPass,EmpRole,EmpBranch);
    	    System.out.println(Result);
    	    WC4.setCellValue(Result);
       }
       FileOutputStream Fos=new FileOutputStream("D:\\rupali_workspace\\Ebanking\\src\\com\\ebanking\\results\\Res_emp.xlsx");
       WB.write(Fos);
       WB.close();
	}

}
