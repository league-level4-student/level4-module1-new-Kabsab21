package _06_Hospital;



public class Patient {

	public boolean cared = false;
	
	boolean feelsCaredFor() {
		return cared;
	}

	public boolean checkPulse() {
		cared = true;
		return true;
	}
	
	public void caredtrue() {
		cared = true;
	}
}
