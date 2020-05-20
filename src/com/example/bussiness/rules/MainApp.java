package com.example.bussiness.rules;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.util.ArrayList;

import com.example.bussiness.data.Student;
import com.example.bussiness.data.StudentData;
import com.example.framwork.data.FooterSection;
import com.example.framwork.data.HeaderSection;
import com.example.framwork.data.ReportBodyData;
import com.example.framwork.exception.EmptyReportException;
import com.example.framwork.exception.UnableTosavereportException;
import com.example.framwork.report.ReportGeneratorInterface;

public class MainApp implements ReportGeneratorInterface{
	
	public MainApp() {
		super();
	}

	public static void main(String[] args) {
		
		MainApp mainapp = new MainApp();
		mainapp.generateReport();
		System.out.println("report generated");
			
		
	}
	
	
	public HeaderSection fetchHeader() {
		HeaderSection hc = new HeaderSection();
		
		hc.title=" details are below ";
		return hc;
	}
	
	public FooterSection fetchFooter() {
		FooterSection fc = new FooterSection();
		
		fc.footerMessage=" footerdata ";
		return fc;
	}


	@Override
	public void generateReport() {
		
		
		try {
			
			HeaderSection hc = fetchHeader();
			ReportBodyData rd = fetchbody();
			FooterSection fc = fetchFooter();
			
			writeData(hc, rd, fc);
			
		}catch(Exception e) {
			System.out.println(e);
		}
		
	}


	


	@Override
	public ReportBodyData fetchbody() throws EmptyReportException {
		
		StudentData studata = new StudentData();
		int sortfield =2;
		String sortorder = "D";
		
		studata.sortData(sortfield, sortorder);
		ReportBodyData rd = studata;
		
		return rd;
		

	}


	@Override
	public void writeData(HeaderSection hc, ReportBodyData rd, FooterSection fs) throws UnableTosavereportException{
		
		try {
			BufferedWriter writer =  new BufferedWriter(new FileWriter(new File("Student_Report.txt")));
			
			writer.write(hc.title + "\n");
			//writer.write("\n");
			
			
			Student s = null;
			
			ArrayList<Student> list = rd.reportData;
			
			
			for (int i = 0; i < list.size(); i++) {
				s= (Student) list.get(i);
				writer.write(s.toString()+ "\n");
			}
			
			
			writer.write(fs.footerMessage);
			
			writer.close();
			
			
		} catch(Exception e) {
			System.out.println("\nThe problem is in MainApp class : -> " + e);
	
		}
		
			
		
		
	}

	@Override
	public HeaderSection fetchheader() {
		// TODO Auto-generated method stub
		return null;
	}
	
	
}








