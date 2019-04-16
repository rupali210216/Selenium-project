package com.ebanking.master;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Notepad1 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		//Instance class
				Library lb=new Library();
				  String Retval=lb.Launchurl("http://183.82.100.55/ranford2");
					System.out.println(Retval);
				                lb.Adminlogin("Admin","M1ndq");
				    //To get text data file path 
				    String Fpath="D:\\rupali_workspace\\Ebanking\\src\\com\\ebanking\\testdata\\Role.txt";            
				    //to get result file path
				    String Rpath="D:\\rupali_workspace\\Ebanking\\src\\com\\ebanking\\results\\Res_role.txt";
				    String Sd;
				    //to get text data file
				    FileReader Fr=new FileReader(Fpath);
				    BufferedReader Br=new BufferedReader(Fr);
				    String Sread=Br.readLine();
				    System.out.println(Sread);
				    //To write the result
				    FileWriter Fw=new FileWriter(Rpath);
				    BufferedWriter Bw=new BufferedWriter(Fw);
				    // for multiple itteration use while loop
				    while((Sd=Br.readLine())!=null){
				    	System.out.println(Sd);
				    	//split
				    	Sd.split("@@@");
				    	String Sr[]=Sd.split("@@@");
				    	String Rn=Sr[0];
				    	String Rd=Sr[1];
				    	String Rt=Sr[2];
				    	String Result=lb.Rolecreation(Rn, Rd, Rt);
				    	System.out.println(Result);
				    	//Result
				    	Bw.write(Rn+"###"+Rd+"###"+Rt+"###"+Result);
				    	Bw.newLine();
				    }
				Br.close();
				Bw.close();
				    
	}

}
