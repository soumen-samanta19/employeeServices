package com.customerServices.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "employee")
public class Employee  implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int employee_id ;
	private String employee_name ;
	private String title ;
	private String business_unit ;
	private String place ;
	private String supervisor_id ;
	private int competencies;
	private int salary;
	
	public int getEmployee_iD() {
		return employee_id;
	}
	public void setEmployee_iD(int employee_id) {
		this.employee_id = employee_id;
	}
	public String getEmployee_name() {
		return employee_name;
	}
	public void setEmployee_name(String employee_name) {
		this.employee_name = employee_name;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getBusiness_unit() {
		return business_unit;
	}
	public void setBusiness_unit(String business_unit) {
		this.business_unit = business_unit;
	}
	public String getPlace() {
		return place;
	}
	public void setPlace(String place) {
		this.place = place;
	}
	public String getSupervisor_id() {
		return supervisor_id;
	}
	public void setSupervisor_id(String supervisor_id) {
		this.supervisor_id = supervisor_id;
	}
	public int getCompetencies() {
		return competencies;
	}
	public void setCompetencies(int competencies) {
		this.competencies = competencies;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
}
