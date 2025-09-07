package _06_Hospital;

import java.util.ArrayList;
import java.util.List;

public class Hospital {

		ArrayList<Doctor>doctors = new ArrayList<Doctor>();
		ArrayList<Patient>patients = new ArrayList<Patient>();
		
	public void addDoctor(Doctor doc) {
		// TODO Auto-generated method stub
		doctors.add(doc);
	}

	public List<Doctor> getDoctors() {
		// TODO Auto-generated method stub
		return doctors;
	}

	public void addPatient(Patient patient) {
		// TODO Auto-generated method stub
		patients.add(patient);
	}

	public List<Patient> getPatients() {
		// TODO Auto-generated method stub
		return patients;
	}

	public void assignPatientsToDoctors() {
		// TODO Auto-generated method stu
		doctors.add(new GeneralPractitioner());
		doctors.add(new GeneralPractitioner());
		doctors.add(new GeneralPractitioner());
		for( int i = 0; i < 8; i++) {
			patients.add(new Patient());
			if(i < 3) {
				doctors.get(0).assignPatient(patients.get(i));
			} else if(i < 6) {
				doctors.get(1).assignPatient(patients.get(i));
			} else {
				doctors.get(2).assignPatient(patients.get(i));
			}
		}
	}

	
	
}
