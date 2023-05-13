import java.util.regex.Matcher;
import java.util.regex.Pattern;
/**
 * This class implements the `User` interface.
 *
 * @author moaz
 */
public class Manage implements User {

    /**
     * The user management system that this class is associated with.
     */
    private UserManagement UsersManagement;

    /**
     * Checks if the given email address is valid.
     *
     * @param email The email address to check.
     * @return `true` if the email address is valid, `false` otherwise.
     */
    public boolean CheckEmail(String email) {
        // Create a regular expression pattern for a valid email address.
        Pattern pattern = Pattern.compile("([A-Za-z0-9#!%$‘&+*–/=?^_`.{|}?~]+@([A-Za-z0-9])+\\.([A-Za-z0-9])+)");

        // Create a matcher object for the given email address.
        Matcher match = pattern.matcher(email);

        // Return true if the email address matches the regular expression pattern.
        return match.find();
    }

    /**
     * Checks if the given phone number is valid.
     *
     * @param phone The phone number to check.
     * @return `true` if the phone number is valid, `false` otherwise.
     */
    public boolean CheckPhoneNumber(String phone) {
        // Create a regular expression pattern for a valid phone number.
        Pattern pattern = Pattern.compile("^01[0-2][0-9]{8}$");

        // Create a matcher object for the given phone number.
        Matcher match = pattern.matcher(phone);

        // Return true if the phone number matches the regular expression pattern and is 11 digits long.
        return match.find() && phone.length() == 11;
    }

    /**
     * Checks if the given password is valid.
     *
     * @param password The password to check.
     * @return `true` if the password is valid, `false` otherwise.
     */
    public boolean CheckPassword(String password) {
        // Check if the password is at least 8 characters long and no more than 30 characters long.
        if (password.length() < 8 || password.length() > 30) {
            System.out.println("Invalid input. please entre password length between 8 and 30 char");
            return false;
        }

        // Check if the password contains at least one uppercase and one lowercase letter.
        int up = 0;
        int low = 0;
        for (int i = 0; i < password.length(); i++) {
            if (Character.isUpperCase(password.charAt(i))) {
                ++up;
            } else if (Character.isLowerCase(password.charAt(i))) {
                ++low;
            }
            if (up > 0 && low > 0) {
                break;
            }
        }
        if (up <= 0 || low <= 0) {
            System.out.println("Invalid input. please entre password with upper case and lower case");
            return false;
        }

        // Check if the password contains at least one digit.
        int digit = 0;
        for (int i = 0; i < password.length(); i++) {
            if (Character.isDigit(password.charAt(i))) {
                ++digit;
                break;
            }
        }
        if (digit == password.length()) {
            System.out.println("Invalid input. please entre password with numbers.");
            return false;
        }

        // Check if the password contains at least one symbol.
        int symbol = 0;
        for (int i = 0; i < password.length(); i++) {
            if (!Character.isLetterOrDigit(password.charAt(i))) {
                ++symbol;
                break;
            }
        }
        if (symbol == password.length()) {
            System.out.println("Invalid input. please entre password with symbol.");
            return false;
        }

        // Return true if all  the checks passed.
        return true;
    }

}