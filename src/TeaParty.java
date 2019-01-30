import javax.swing.JOptionPane;

public class TeaParty {
	String name;
	boolean isWoman;
	boolean isKnighted;

	public String welcome(String name, boolean isWoman, boolean isKnighted) {
	String greeting = "Hello";	
	if(!isWoman) {
		if (isKnighted) {
			greeting += " Sir ";
		}else {
			greeting += " Mr. ";
		}
	}else {
		if (isKnighted) {
			greeting += " Lady ";
		}
		greeting += " Ms. ";
	}
	return greeting + name;
	}
}