package com.cdgn.Work1;

public class Patient {
	
	private String fullName;
	private int recordNumber;
	private String isHealthy;
	public Patient(String fullName, int recordNumber, String isHealthy) {
		this.fullName = fullName;
		this.recordNumber = recordNumber;
		this.isHealthy = isHealthy;
	}
	public String getFullName() {
		return fullName;
	}
	public int getRecordNumber() {
		return recordNumber; 
	}
	public void updateMedicalHistory(String medi) {
        this.isHealthy = medi;
    }	
	public String getIsHealthy() {
		return isHealthy;
	}

}
