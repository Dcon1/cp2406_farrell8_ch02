import javax.swing.*;

/**
 * Created by danny on 8/9/2017.
 */
public class Eggs {
    public static void main(String[] args)
    {
        String userChoice;
        int totalEggs, dozen, single;
        Double dozenPrice, singlePrice, totalPrice;
        dozenPrice = 3.25;
        singlePrice = 0.45;
        userChoice = JOptionPane.showInputDialog("Please enter the amount of eggs you want");
        totalEggs = Integer.parseInt(userChoice);
        single = totalEggs % 6;
        dozen = totalEggs / 6;
        totalPrice = single * singlePrice + dozen * dozenPrice;
        System.out.println("You have ordered " + totalEggs + " eggs, that's " + dozen + " dozen at " + dozenPrice + " per dozen and " + single + " loose eggs at " + singlePrice + " Kcents each for a total of $" + totalPrice);    }
}
