package practicalseven;

public class PasswordChecker {

  /**
   * The password to be checked for the PasswordChecker class.
   **/
  private String password;

  /**
   * The desired length of the password to be checked.
   **/
  private static int PASSWORD_MINIMUM_LENGTH = 10;

  /**
   * The constructor for the PasswordChecker.
   **/
  public PasswordChecker(String startingPassword) {
    password = startingPassword;
  }

  // TODO: Add the appropriate JavaDoc comment for this method

  public boolean isValidPassword() {
    // TODO: Add in the correct implementation of a method that
    // will determine if the password instance variable is correct.
    // Please refer to the assignment sheet for details about how
    // to check a password. You need to ensure that it has:
    // 1. A valid length
    // 2. A capitalized letter
    // 3. A lowercase letter
    // 4. A valid number
    // Again, please refer to the assignment sheet for details!
    // Note that the current return value for this method is incorrect.
    boolean isValidLength = false;
    boolean isValidCapitalized = false;
    boolean isValidLowerCase = false;
    boolean isValidNumber = false;
    int passwordIndex = 0;
    return true;
  }

}
