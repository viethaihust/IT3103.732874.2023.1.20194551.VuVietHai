package Lab01;
import javax.swing.JOptionPane;
public class CaculateDouble {

	public static void main(String[] args) {
		String s1 = JOptionPane.showInputDialog(null,"Please input the first number:"); 
        String s2 = JOptionPane.showInputDialog(null,"Please input the second number:");
        double sum, difference, product, quotient;
        sum = Double.parseDouble(s1) + Double.parseDouble(s2);
        difference = Double.parseDouble(s1) - Double.parseDouble(s2);
        product = Double.parseDouble(s1) * Double.parseDouble(s2);
        System.out.println("Sum of 2 numbers: " + sum);
        System.out.println("Difference of 2 numbers: " + difference);
        System.out.println("Product of 2 numbers: " + product);
        if(Double.parseDouble(s2) != 0)
        {
            quotient = Double.parseDouble(s1)/Double.parseDouble(s2);
            System.out.println("Quotient of 2 numbers: " + quotient);
        }
	}
}
