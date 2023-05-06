import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class Manage implements User{
    private UserManagement UsersManagement;
    public boolean CheckEmail(String email)
    {
        Pattern pattern = Pattern.compile("([A-Za-z0-9#!%$‘&+*–/=?^_`.{|}?~]+@([A-Za-z0-9])+\\.([A-Za-z0-9])+)"); // email format
        Matcher match = pattern.matcher(email);
        if (match.find())
        {
            return true;
        }
        else
        {
            return false;
        }
    }
    public boolean CheckPhoneNumber(String phone)
    {
        Pattern pattern = Pattern.compile("(01)+([0-2]|5)+[0-9]+"); // number format
        Matcher match = pattern.matcher(phone);
        if (match.find())
        {
            if(phone.length() == 11)
            {
                for (int i = 0 ; i<11;i++)
                {
                    if(!Character.isDigit(phone.charAt(i)))
                    {
                        return false;
                    }
                }
                return true;
            }
            else
            {
                return false;
            }

        }
        else
        {
            return false;
        }
    }
    public boolean CheckPassword(String password)
    {
        int up = 0;
        int low = 0;
        int digit = 0;
        int symbol = 0;

        if (password.length() < 8 || password.length() > 30) {
            System.out.println("Invalid input. please entre password length between 8 and 30 char");
            return false;
        }

        for (int i = 0; i < password.length(); i++) {
            if (Character.isUpperCase(password.charAt(i))) {
                ++up;

            }
            else if (Character.isLowerCase(password.charAt(i))) {
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

        for (int i = 0; i < password.length(); i++)
        {
            if (Character.isDigit(password.charAt(i))) {
                break;
            }
            else if (!Character.isDigit(password.charAt(i))) {
                ++digit;
            }
        }
        if (digit == password.length())
        {
            System.out.println("Invalid input. please entre password with numbers.");
            return false;
        }





        for (int i = 0; i < password.length(); i++)
        {
            if (!Character.isLetterOrDigit(password.charAt(i))) {
                break;
            }
            else {
                ++symbol;
            }


        }
        if (symbol == password.length())
        {
            System.out.println("Invalid input. please entre password with symbol.");
            return false;
        }

        return true;


    }

}
