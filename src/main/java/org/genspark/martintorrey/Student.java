package org.genspark.martintorrey;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("studentBean")
public class Student {
	
	@Value("14029483")
	private int id;
	
	@Value("Student Name")
	private String name;
	
	@Autowired
	private List<Phone> ph;
	
	@Autowired
	private Address add;

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", ph=" + ph + ", add=" + add + "]";
	}
}

