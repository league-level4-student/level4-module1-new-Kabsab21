package _06_Hospital;

import java.util.ArrayList;
import java.util.List;

public abstract class Doctor {
	
	

	ArrayList<Patient>assipa = new ArrayList<Patient>();
	
	protected void assignPatient(Patient patient) {
		// TODO Auto-generated method stub
		assipa.add(patient);
	}

	protected void doMedicine() {
		for( Patient pa : assipa) {
			pa.caredtrue();
		
		}
	}

	protected abstract boolean makesHouseCalls();
	
	protected abstract boolean performsSurgery();
	
	public List<Patient> getPatients() {
		// TODO Auto-generated method stub
		return assipa;
	}
	
	
	

}
