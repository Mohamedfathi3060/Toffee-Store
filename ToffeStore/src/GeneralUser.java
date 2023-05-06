import java.util.Objects;
import java.util.Scanner;
public class GeneralUser implements User{
    UserManagement Manager = new UserManagement();
    public void register()
    {
        Manage manage = new Manage();
        LoggedInUser user = new LoggedInUser();
        Scanner scanner = new Scanner(System.in);
        boolean logged = false;
        System.out.println("Hello in our website.");
        System.out.print("Enter your name: ");
        String name = scanner.nextLine();
        user.SetUserName(name);
        while (true)
        {
            boolean flag = true;
            System.out.print("Enter your ID: ");
            String ID = scanner.nextLine();
            for (int i = 0;i < Manager.logged.size();i++)
            {
                if(Objects.equals(ID, Manager.logged.get(i).getUserID()))
                {
                    System.out.println("The ID register before Do you want login?");
                    System.out.print("Yes for login OR No for register with different ID: ");
                    String s = scanner.nextLine();
                    if( Objects.equals(s.toLowerCase(), "yes"))
                    {
                        login();
                        return;

                    }
                    else
                    {
                        flag = false;
                    }
                }
            }
            if(flag)
            {
                user.SetUserID(ID);
                break;
            }
        }
        System.out.print("Enter your Address: ");
        String address = scanner.nextLine();
        user.SetAddress(address);
        while (true)
        {
            boolean flag = true;
            System.out.print("Enter your Phone Number: ");
            String phone= scanner.nextLine();
            for (int i = 0;i < Manager.logged.size();i++)
            {
                if(Objects.equals(phone, Manager.logged.get(i).getPhoneNumber()))
                {
                    System.out.println("The phone number used before please entre different number.");
                    flag = false;
                }
            }
            if(!flag)
            {
                continue;
            }
            if (manage.CheckPhoneNumber(phone))
            {

                user.SetPhoneNumber(phone);
                break;
            }
            else
            {
                System.out.println("invalid input.Please enter correct number.");
            }
        }
        while (true)
        {
            boolean flag = true;
            System.out.print("Enter your Email: ");
            String email= scanner.nextLine();
            for (int i = 0;i < Manager.logged.size();i++)
            {
                if(Objects.equals(email, Manager.logged.get(i).getEmail()))
                {
                    System.out.println("The email used before please entre different email.");
                    flag = false;
                }
            }
            if(!flag)
            {
                continue;
            }
            if (manage.CheckEmail(email))
            {
                user.SetEmail(email);
                break;
            }
            else
            {
                System.out.println("invalid input.Please enter correct email.");
            }
        }

        while (true)
        {

            System.out.print("Enter your password: ");
            String pass= scanner.nextLine();

            if (manage.CheckPassword(pass))
            {
                user.SetPassword(pass);
                break;
            }
        }
        Manager.add(user);

    }
    public void login()
    {
        boolean LoginSuccessful = false;
        Scanner scanner = new Scanner(System.in);
       while (!LoginSuccessful)
       {
           System.out.print("Enter your ID: ");
           String ID = scanner.nextLine();
           for (int i = 0;i < Manager.logged.size();i++)
           {
               if(Objects.equals(ID, Manager.logged.get(i).getUserID()))
               {
                   while (true)
                   {

                       System.out.print("Enter your password: ");
                       String password = scanner.nextLine();
                       if (Objects.equals(password, Manager.logged.get(i).getPassword())) {
                           System.out.println("login successful");
                           LoginSuccessful = true;
                           break;
                       }
                       System.out.println("password don't match any account. please entre correct password.");
                   }
                   break;
               }
           }
           if(!LoginSuccessful)
           {
               System.out.println("ID don't match any account. please entre correct ID.");
           }
       }
    }
}
