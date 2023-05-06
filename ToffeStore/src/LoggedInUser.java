public class LoggedInUser implements User {
    private String UserID;
    private String UserName;
    private String Password;
    private String Address;
    private String PhoneNumber;
    private String Email;
    public void SetUserID(String ID)
    {
        UserID = ID;
    }
    public void SetUserName(String Name)
    {
        UserName = Name;
    }
    public void SetPassword(String Pass)
    {
        Password = Pass;
    }
    public void SetAddress(String address)
    {
        Address = address;
    }
    public void SetPhoneNumber(String Number)
    {
        PhoneNumber = Number;
    }
    public void SetEmail(String mail)
    {
        Email = mail;
    }

    public String getUserID()
    {
        return UserID;
    }
    public String getPassword()
    {
        return Password;
    }
    public String getEmail()
    {
        return Email;
    }
    public String getPhoneNumber()
    {
        return PhoneNumber;
    }

}
