package keyword;

import java.io.FileInputStream;

import java.io.FileOutputStream;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import com.ebanking.master.Library;

public class Keyword {

	public static void main(String[] args) throws Throwable {
		// TODO Auto-generated method stub

		//instance class
		
		Library lb=new Library();
						 String Res=null;
						 String kpath="F:\\rupali_workspace\\Ebanking\\src\\keyword\\keyword_data.xlsx";
						 String Kout="F:\\rupali_workspace\\Ebanking\\src\\keyword\\Res_data.xlsx";
						 FileInputStream fis=new FileInputStream(kpath);
						 //workbook
						 XSSFWorkbook wb=new XSSFWorkbook(fis);
						 //sheet
						 XSSFSheet ws=wb.getSheet("TestCase");
						 XSSFSheet ws1=wb.getSheet("TestSteps");
		                 //row count
						 int tcRc = ws.getLastRowNum();
						 System.out.println(tcRc);
						 int tsRc=ws1.getLastRowNum();
						 System.out.println(tsRc);
						 //testcases
						 for(int i=1 ;i<=tcRc;i++){
							 String exe=ws.getRow(i).getCell(2).getStringCellValue();
							 if(exe.equalsIgnoreCase("Y")){
								 String tcId=ws.getRow(i).getCell(0).getStringCellValue();
								 System.out.println(tcId);
								 
								 //teststeps
						for(int j=1;j<=tsRc;j++){
							String TstcId =ws1.getRow(j).getCell(0).getStringCellValue();
							//System.out.println(TstcId);
							if(tcId.equalsIgnoreCase(TstcId)){
								String Keyword=ws1.getRow(j).getCell(3).getStringCellValue();
								System.out.println(Keyword);
								switch(Keyword)
								{
								case "RLanch":
									Res=lb.Launchurl("http://183.82.100.55/ranford2");
									break;
								case "RLogin":
									Res=lb.Adminlogin("Admin","M1ndq");
									break;
								case "RLogout": 	
									lb.Logout();
									break;
								case "RBranch":
									lb.BranchCreation("xhjfjhfg","padur","603106");
									break;
								case "RRole":
									Res=lb.Rolecreation("Clerk","xshd","");
									break;
								case "RClose":
									lb.Close();
									break;
								
								default:
									System.out.println("Pass a Valid Keyword");
									break;
								}
								//result updation in test steps sheet
								ws1.getRow(j).createCell(4).setCellValue(Res);
								//result updation in test case sheet
									if(!ws1.getRow(j).getCell(4).getStringCellValue().equalsIgnoreCase("fail")){
										ws.getRow(i).createCell(3).setCellValue(Res);
										}else{
											ws.getRow(i).createCell(3).setCellValue("fail");
										}
							}
							
						}
							 }else
								{
									ws.getRow(i).createCell(3).setCellValue("BLOCKED");
								}
						 }
						 FileOutputStream fo=new FileOutputStream(Kout);
							wb.write(fo);
							wb.close();

						 
	}

}
