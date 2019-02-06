import javax.swing.JOptionPane;

public class PopcornMaker {
public static void main(String[] args) {
	String type = JOptionPane.showInputDialog("what type of popcorn would you like?");
	String time = JOptionPane.showInputDialog("how much time should I microwave your popcorn?");
	
	Popcorn pop = new Popcorn(type);
	Microwave wave = new Microwave();
	wave.putInMicrowave(pop);
	wave.setTime(3);
	wave.startMicrowave();
}
}