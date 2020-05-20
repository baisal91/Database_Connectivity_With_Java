package com.example.framwork.data;

import java.util.ArrayList;

public abstract class ReportBodyData {

	public ArrayList reportData;
	
	public ReportBodyData() {
		reportData = null;
	} 
	
	public abstract void sortData(int sortField, String sortOrder);
	
}
