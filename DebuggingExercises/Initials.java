import javax.swing.JOptionPane;
import static javax.swing.JOptionPane.showInputDialog;

/**
 * Created by danny on 8/9/2017.
 */
public class Initials {
    public static void main(String[] args) {
        String first, middle, last;
        first = JOptionPane.showInputDialog("Please enter your first initial");
        middle = JOptionPane.showInputDialog("Please enter your middle initial.");
        last = JOptionPane.showInputDialog("Please enter your last initial");
        System.out.println(first + middle + last);
    }
}
