package com.makotojava.intro;

import java.util.Locale;
import java.util.logging.Logger;

public class Person {
	//private String name;
	private String firstName;
	private String lastName;
	private int age;
	private int height;
	private int weight;
	private String eyeColor;
	private String gender;

	public Person() {
		
	}
		// Nothing to do...
	public Person(String firstName, String lastName, int age, int height, int weight, String eyeColor, String gender) {
		  this.firstName = firstName;
		  this.lastName = lastName;
		  this.age = age;
		  this.height = height;
		  this.weight = weight;
		  this.eyeColor = eyeColor;
		  this.gender = gender;
		}
	Logger l = Logger.getLogger(Person.class.getName());
	
		/*public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;}*/
	public String getName() {
		return getFirstName().concat(" ").concat(getLastName());
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public int getHeight() {
		int ret = height;
		// If locale of the computer this code is running on is U.S.,
		if (Locale.getDefault().equals(Locale.US))
		ret /= 2.54;// convert from cm to inches
		return ret;
	}
	public void setHeight(int height) {
		this.height = height;
	}
	public int getWeight() {
		return weight;
	}
	public void setWeight(int weight) {
		this.weight = weight;
	}
	public String getEyeColor() {
		return eyeColor;
	}
	public void setEyeColor(String eyeColor) {
		this.eyeColor = eyeColor;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	public void printAudit(StringBuilder buffer) {
		buffer.append("Name=");
		buffer.append(getFullName());
		buffer.append(",");
		buffer.append("Age=");
		buffer.append(getAge());
		buffer.append(",");
		buffer.append("Height=");
		buffer.append(getHeight());
		buffer.append(",");
		buffer.append("Weight=");
		buffer.append(getWeight());
		buffer.append(",");
		buffer.append("EyeColor=");
		buffer.append(getEyeColor());
		buffer.append(",");
		buffer.append("Gender=");
		buffer.append(getGender());
		}
		public void printAudit(Logger l) {
		StringBuilder sb = new StringBuilder();
		printAudit(sb);
		l.info(sb.toString());
		}
		

}

