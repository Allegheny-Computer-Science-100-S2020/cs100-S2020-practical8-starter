package practicaleight;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Date;
import java.util.Scanner;

/**
 * The PasswordCheckerMain will construct and use the PasswordChecker.
 **/

public class PasswordCheckerMain {

  /**
   * Display a human-readable diagnostic message.
   **/
  public static String getHumanReadableAnswer(boolean truthValue) {
    if (truthValue) {
      return "Yes";
    }
    return "No";
  }

  /**
   * Construct and use an instance of the PasswordChecker.
   **/
  public static void main(String[] args) {

    // Step One: Declare the starting file and scanner
    File passwordInputFile = null;
    Scanner scanner = null;

    // Step Two: Connect the scanner to the input file
    try {
      passwordInputFile = new File("inputs/password_input.txt");
      scanner = new Scanner(passwordInputFile);
    } catch (FileNotFoundException noFile) {
      System.out.println("Unable to locate the file.");
    }

    // Step Three: Display a welcome message
    System.out.println("Gregory M. Kapfhammer " + new Date());
    System.out.println();

    // Step Four: Read in the year from the file
    System.out.println("I will read in a password from a file.");
    String chosenPassword;
    chosenPassword = scanner.nextLine();
    System.out.println("Okay, I read in the password \"" + chosenPassword + "\".");

    // TODO: Step Five: Construct an instance of the PasswordChecker class

    // TODO: Step Six: Call a method to see if it is a valid password and produce output

    // TODO: Step Seven: Display the closing message
  }

}
