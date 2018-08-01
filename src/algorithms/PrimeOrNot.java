package algorithms;
import javax.swing.JOptionPane;

public class PrimeOrNot {
 public static void main(String[] args) {
	String nnum = JOptionPane.showInputDialog("Type in a number to see if it is Prime or Not.");
	int num = Integer.parseInt(nnum);
	for(int i = 2; i < num; i++) {
		if(num % i == 0) {
			JOptionPane.showMessageDialog(null, "That number is not prime.");
			break;
		}
		else if(i == num - 1) {
			JOptionPane.showMessageDialog(null, "That number is prime!");
		}
	}
}
}
