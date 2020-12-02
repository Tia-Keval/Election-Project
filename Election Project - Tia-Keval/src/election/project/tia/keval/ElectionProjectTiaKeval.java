package election.project.tia.keval;
import java.util.Scanner;
import java.util.ArrayList;

/**
 *
 * @author Tia - [] / Keval - [21440808]
 * 
 * Election Project
 *
 * NOTES:
 *      Basic Welcome added
 *      Input implemented, loop included
 *      Automatically adds input to array
 *      ability to stop program added
 *      ---- You can delete line 48 if you need, only needed for testing. ----
 */
public class ElectionProjectTiaKeval {

    public static void main(String[] args) {
        // KEVAL START
        ArrayList<String> Candidate_List = new ArrayList<>(); // CREATE ARRAY LIST

        System.out.println("------------------------------"); // WELCOME MESSAGE #1
        System.out.println("      Enter votes here\nEnter '-1' to finish counting."); // WELCOME MESSAGE #2
        System.out.println("------------------------------"); // WELCOME MESSAGE #3

        String Candidate = ""; // CREATE INPUT VARIABLE
        while (!Candidate.equals("-1")){ // TO BREAK LOOP WHEN NEEDED
            Scanner Scan = new Scanner(System.in); // NEW SCANNER OBJECT
            System.out.print("Enter candidate name: "); // ASKS THE USER FOR A INPUT
            Candidate = Scan.nextLine(); // APPLIES INPUT TO VARIABLE

            if (Candidate.equals("-1")) { // IF USER WANTS TO STOP
                break; // STOPS THE LOOP
            } // END OF IF STATEMENT
            Candidate_List.add(Candidate); // ADDS THE USER NAME TO ARRAY LIST
        } // END OF WHILE LOOP

        System.out.println(Candidate_List); // TESTING PURPOSES
        // KEVAL END
    }
    
}
