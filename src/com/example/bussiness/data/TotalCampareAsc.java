package com.example.bussiness.data;

import java.util.Comparator;

public class TotalCampareAsc implements Comparator<Student>{

	@Override
	public int compare(Student s1, Student s2) {
		// TODO Auto-generated method stub
		int t1= s1.getEnglish()+s1.getMaths()+s1.getPhysics();
		int t2= s2.getEnglish()+s2.getMaths()+s2.getPhysics();
		
		
		if(t1==t2) 
			return 0;
		
		else if (t1> t2)
			return 1;
		
		else 
			return -1;
		
		
		
	
	}

}
