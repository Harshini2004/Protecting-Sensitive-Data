package com.cdgn.Work1;

public class Doctor {
	public void Update(Patient p, String medi, boolean ill) {
		if(ill) {
			p.updateMedicalHistory(medi);
			System.out.println("Medical History Updated.");
		}else {
			System.out.println("No improment");
		}
	}
}
