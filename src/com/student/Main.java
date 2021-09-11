package com.student;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Student> list = new ArrayList<Student>();
		list.add(new Student(101, "Han", 23));
		list.add(new Student(102, "Song", 16));
		list.add(new Student(103, "Lee", 23));
		list.add(new Student(104, "Kim", 27));
		list.add(new Student(105, "Park", 19));
		list.add(new Student(106, "Baek", 20));
		list.add(new Student(107, "Oh", 21));
		list.add(new Student(108, "Choi", 24));
		list.add(new Student(109, "Jun", 28));
		list.add(new Student(110, "Son", 24));
		
		Collections.sort(list);
		
		System.out.println("Student List (ordered by name)");
		for(Student s : list) {
			System.out.println(s.toString());
		}
		
		Collections.sort(list,Collections.reverseOrder());
		System.out.println("Student List (reverse ordered by name)");
		for(Student s : list) {
			System.out.println(s.toString());
		}
	}

}
