package com.ebanking.master;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class NotePad {

	public static void main(String[] args) throws IOException, InterruptedException {
		// TODO Auto-generated method stub
    //Instance class
		Library lb=new Library();
		  String Retval=lb.Launchurl("http://183.82.100.55/ranford2");
			System.out.println(Retval);
		                lb.Adminlogin("Admin","M1ndq");
		    //To get text data file path  
		  String Fpath="D:\\rupali_workspace\\Ebanking\\src\\com\\ebanking\\testdata\\Branch.txt";  
		  //to get result file path
		  String Rpath="D:\\rupali_workspace\\Ebanking\\src\\com\\ebanking\\results\\Res_Branch.txt";
		  String Sd;
		  
		  //to get text data file
		  FileReader Fr=new FileReader(Fpath);
		  BufferedReader Br= new BufferedReader(Fr);
		  String Sread=Br.readLine();
		  System.out.println(Sread);
		  
		  //to write the result
		  FileWriter Fw=new FileWriter(Rpath);
		  BufferedWriter Bw=new BufferedWriter(Fw);
		  //for multiple ittreation use whileloop
		  while((Sd=Br.readLine())!=null){
			  System.out.println(Sd);
			  //split
			  Sd.split("###");
			  String Sr[]=Sd.split("###");
			  String Bn=Sr[0];
			  String Badd=Sr[1];
			  String Brpin=Sr[2];
			  String Res=lb. BranchCreation(Bn,Badd,Brpin);
			  System.out.println(Res);
			  //Result
			  Bw.write(Bn+"@@@"+Badd+"@@@"+Brpin+"@@@"+Res);
			  Bw.newLine();		  
		  }
		 Br.close();
		 Bw.close();
		  
	}

}
