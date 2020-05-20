package com.example.framwork.report;

import com.example.framwork.data.FooterSection;
import com.example.framwork.data.HeaderSection;
import com.example.framwork.data.ReportBodyData;
import com.example.framwork.exception.EmptyReportException;
import com.example.framwork.exception.UnableTosavereportException;

public interface ReportGeneratorInterface {
	
	public void generateReport();
	
	public HeaderSection fetchheader();
	public ReportBodyData fetchbody() throws EmptyReportException;
	public FooterSection fetchFooter();
	
	public void writeData(HeaderSection hc, ReportBodyData rd, FooterSection fs) throws UnableTosavereportException;
	
	
	
}
