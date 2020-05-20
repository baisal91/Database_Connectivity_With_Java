package com.example.bussiness.data;

import java.util.Collections;

import com.example.framwork.data.ReportBodyData;

public class StudentData  extends ReportBodyData{

	
		public static final int NAME=1;
		public static final int TOTAL=2;
		
		public static final String ACS="A";
		public static final String DESC="B";
	
		public StudentData() {
			
			StudentDao dao = new StudentDao();
			reportData = dao.fetchStudentData();
			
		}

		@Override
		public void sortData(int sortField, String sortOrder) {
			// TODO Auto-generated method stub
			
			switch(sortField) {
			
			case NAME:
				
				if(sortOrder.equals(ACS)) {
					NameCompareAsc nameSort = new NameCompareAsc();
					Collections.sort(reportData, nameSort);
				} 
				
				else if(sortOrder.equals(DESC)) {
					NameCompareDesc nameSort = new NameCompareDesc();
					Collections.sort(reportData, nameSort);
				}
				
			case TOTAL:
				if(sortOrder.equals(ACS)) {
					TotalCampareAsc total1 = new TotalCampareAsc();
					Collections.sort(reportData, total1);
				}
				else if(sortOrder.equals(ACS)) {
					TotalCompareDesc total2 = new TotalCompareDesc();
					Collections.sort(reportData, total2);
				}
				break;
				default:
					break;
				
				
				
				
				
			}
				
			
		}
	
}
