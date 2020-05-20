package com.example.bussiness.data;

import java.util.Comparator;

public class NameCompareDesc implements Comparator<Student>{

	@Override
	public int compare(Student s1, Student s2) {
		// TODO Auto-generated method stub
		return s2.getName().compareTo(s1.getName());
	}

}
