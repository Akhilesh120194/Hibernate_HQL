package com.akhilexpress.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

@Entity
@Table(name="students")
/*@NamedQuery(name="myapp.allstudents",query="from Student")
@NamedQuery(name="myapp.allstudents.namelike",query="from Student where name like '%a%'")
*/
@NamedQueries(
		value={
				@NamedQuery(name="myapp.allstudents",query="from Student"),
				//	@NamedQuery(name="myapp.allstudents.namelike",query="from Student where name like '%a%'")
				@NamedQuery(name="myapp.allstudents.namelike",query="from Student where name like :substring")

		})
public class Student {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	
	@Column(name="student_name",length=70,nullable=false)
	private String name ;
	private long mobile;
	
	private int age ;
	
	private  String country;
	
	
	public Student() {
		
	}
	
	public Student(int id, String name, long mobile) {
	
		this.id = id;
		this.name = name;
		this.mobile = mobile;
	}
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public long getMobile() {
		return mobile;
	}
	public void setMobile(long mobile) {
		this.mobile = mobile;
	}


	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", mobile=" + mobile + ", age=" + age + ", country=" + country
				+ "]";
	}

	
	
	

}
