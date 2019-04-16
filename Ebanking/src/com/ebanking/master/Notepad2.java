package com.ebanking.master;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Notepad2 {

	public static void main(String[] args) throws IOException {
		//Instance class
		Library lb=new Library();
		  String Retval=lb.Launchurl("http://183.82.100.55/ranford2");
			System.out.println(Retval);
		                lb.Adminlogin("Admin","M1ndq");
		    //To get text data file path
		    String Fpath="D:\\rupali_workspace\\Ebanking\\src\\com\\ebanking\\testdata\\Empl.txt";    
		    //to get the result file path
		    String Rpath="D:\\rupali_workspace\\Ebanking\\src\\com\\ebanking\\results\\Res_Emp.txt";
		    String Sd;
		  //to get text data file
		    FileReader Fr=new FileReader(Fpath);
		    BufferedReader Br=new BufferedReader(Fr);
		    String SRead=Br.readLine();
		    System.out.println(SRead);
		  //To write the result
		    FileWriter Fw=new FileWriter(Rpath);
		    BufferedWriter Bw= new BufferedWriter(Fw);
		    // for multiple itteration use while loop
		    while((Sd=Br.readLine())!=null){
		    	System.out.println(Sd);
		    	//split
		    	Sd.split("@@@");
		    	String Sr[]=Sd.split("@@@");
		    	String EmpN=Sr[0];
		    	String EmpP=Sr[1];
		    	String EmpRo=Sr[2];
		    	String EmpBr=Sr[3];
		    	String Result=lb.Employeecreation(EmpN, EmpP, EmpRo, EmpBr);
		    	System.out.println(Result);
		    	//Result
		    	Bw.write(Result);
		    	Bw.newLine();
		    }
		    Br.close();
		    Bw.close();
		    	
		    }

	}


