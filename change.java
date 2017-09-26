// Author Tsegab Gebregziabher
// created on 09/26/2017
// class exercise 2.5

// This is to import JOptionpane from the library
import javax.swing.JOptionPane;
public class Change {
// This the main method
    public static void main(String [] args){
// we are declaring variables
        final int Quarter = 25;
        final int dimes = 10;
        final int Nickle = 5;
        final int penny = 1;
// This what our input reads for the user
        String input = JOptionPane.showInputDialog("Enter amount in 1,5,10 dollar bills");
// This Arthemthic method of chaging in too 100s
        int amount = Integer.parseInt(input)*100;
// This is our output for our user
        JOptionPane.showMessageDialog(null,"The change in Quarter is " + amount/Quarter + "\n The change in dimes is " + amount/dimes + "\n The change in nickles is " + amount/Nickle + "\t" + "\n The change is penny is " + amount/penny);








    }



}
