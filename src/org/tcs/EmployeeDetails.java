package org.tcs;

public class EmployeeDetails {
	public void employeeData() {
System.out.println("employee data");

	}
	
	//different datatype
	
	public void employeeData(String name) {
		System.out.println("employee name:"+name);

			}
	public void employeeData(int id) {
		System.out.println("employee id:"+id);
	}
	
	//different data type count
	public void employeeData(int id,float height) {
		System.out.println("employee id:"+id+"\nemployee height:"+height);
		
				
	}
	
	//different data type order
	
	
	public void employeeData(float weight,int age) {
		System.out.println("employee weight:"+weight+"\nemployee age:"+age);
		
		
	}
	
	public static void main(String[] args) {
		EmployeeDetails e=new EmployeeDetails();
		e.employeeData();
		e.employeeData("ram");
		e.employeeData(4567);
		e.employeeData(56.2f, 23);
		e.employeeData(2345, 5.2f);
		
		
		
	}
	
	
}
	
	
	
	
