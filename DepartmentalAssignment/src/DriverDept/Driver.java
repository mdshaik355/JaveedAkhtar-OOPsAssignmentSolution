package DriverDept;

import Departmental.AdminDepartment;
import Departmental.HrDepartment;
import Departmental.TechDepartment;

public class Driver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AdminDepartment adminDepartment = new AdminDepartment();
		HrDepartment HrDepartment = new HrDepartment();
		TechDepartment TechDepartment = new TechDepartment();
		
		System.out.println("Welcome to " + adminDepartment.departmentName());
		System.out.println(adminDepartment.getTodaysWork());
		System.out.println(adminDepartment.getWorkDeadline());
		System.out.println(adminDepartment.isTodayAHoliday());
		
		System.out.println("\nWelcome to " + HrDepartment.departmentName());
		System.out.println(HrDepartment.doActivity());
		System.out.println(HrDepartment.getTodaysWork());
		System.out.println(HrDepartment.getWorkDeadline());
		System.out.println(HrDepartment.isTodayAHoliday());
		
		System.out.println("\nWelcome to " + TechDepartment.departmentName());
		System.out.println(TechDepartment.getTodaysWork());
		System.out.println(TechDepartment.getWorkDeadline());
		System.out.println(TechDepartment.getTechStackInformation());		
		System.out.println(TechDepartment.isTodayAHoliday());
		

	}

}
