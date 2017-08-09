import javax.swing.JOptionPane;

import static javax.swing.JOptionPane.showInputDialog;

public class FixDebugTwo4
{
   public static void main(String[] args)
   {
      String costString;
      double cost;
      final double TAX = 0.06;
      costString = showInputDialog("Enter price of item you are buying, Purchases");
       //Confused on this part
         JOptionPane.INFORMATION_MESSAGE);
      cost = Double.parseInt(costString);
      JOptionPane.showMessageDialog(null,"With " + tax * 100 +
         "% tax,  purchase  is $" + (cost - cost * tax));
   }
}
