public class LogIn {
    private String userName;
    private String passWord;
    private String role;
    LogIn(String a,String b,String c)
    {
       userName = a;
       passWord = b;
       role = c;
    }

     public void setUserName(String userName){
        this.userName = userName;
     }
    public void setPassWord(String passWord){
        this.passWord = passWord;
    }
    public void setRole(String role){
        this.role =role;
    }
    public String getPassword(){
        return  passWord;
    }
    public String getUserName() {
        return userName;
    }
    public String getRole(){
        return role;
    }
    public String getLogIn()
    {
        return "User Name :"+ userName +"     passWord  :" + passWord +"    role :" + role;
    }
}
