package com.cdgn.Work1;

import java.util.Scanner;

public class HospitalStaff {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String name = sc.nextLine();
		int n = sc.nextInt();
		sc.nextLine();
		String s = sc.nextLine();
		Patient p = new Patient(name,n,s);
		System.out.println(+p.getRecordNumber()+" "+p.getFullName());
		Doctor d = new Doctor();
		d.Update(p, sc.nextLine(), sc.nextBoolean());
		
	}
	
}
