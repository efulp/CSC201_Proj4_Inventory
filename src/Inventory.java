import java.util.Scanner;

/**
 * This class (and main) reads an inventory data file and constructs a BST and AVL-tree.  
 * Inventory data file is a command line argument, the number of inventory updates is
 * displayed to the screen, as well as the BST and AVL-trees (as a string).
 *
 * @author Nirre Pluf {@literal <pluf@wfu.edu>}  
 * @version 0.1, April 8, 2021
 */
public class Inventory {
    public static void main(String[] args) {
        if(!argsOK(args))
            System.exit(1);


    }  


   /**
     * Checks the command line args are correct (1 string)
     *
     * @param args String[] first is inventory file
     * @return true if everyting is OK, false otherwise
     */
    private static boolean argsOK(String[] args) {
        if(args.length < 1){
            System.out.println("Usage: java Inventory inventoryFile ");
            System.out.println("  inventoryFile  file containing inventory updates "); 
            return false;
        }
        return true;
    }

}  


