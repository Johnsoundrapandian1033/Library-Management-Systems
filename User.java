
import java.util.*;
public class User {
    ArrayList<LogIn>searchPassWord;
    ArrayList<LogIn>searchUserName;
    ArrayList<LogIn>searchRole;
    ArrayList<LogIn>signUps;
    ArrayList<LogIn>logOut;
    List<LogIn>user  = new ArrayList<>();
    public boolean logIn(String username,String password,String role){
        if(user == null || user.size() == 0){
            return false;
        }
        for(int i =0; i < user.size();i++){
            if(user.get(i).getUserName().equals(username) && user.get(i).getPassword().equals(password) && user.get(i).getRole().equals(role)){
                return true;
            }
        }
        return false;
    }
    public boolean changePassword(String username,String password,String role,String password2){
        if(user == null || user.size() == 0){
            return false;
        }
        if(password.equals(password2)){
            for(int i = 0; i<user.size();i++) {
            if (user.get(i).getUserName().equals(username) && user.get(i).getRole().equals(role)) {
                user.add(new LogIn(username, password2, role));
                user.remove(user.get(i));
                return true;
            }
          }

        }
        return false;
    }
    public ArrayList<LogIn> signUp(String username,String password,String role){
        this.signUps = new ArrayList<>();
        //for(int i =0; i < user.size();i++){
           if( user.get(5).getRole().equals(role)) {
               user.add(new LogIn(username, password, role));
                signUps.add(new LogIn(username,password,role));
                System.out.println(signUps.size());
              }
           //}
         if(signUps.size() == 0 && signUps == null){
             return null;
         }
        return  signUps;
    }

  /* public boolean  management(){
              this.signUps = new ArrayList<>();
              return true;
        }*/

        public boolean logOut(String username,String password,String role){
            this.logOut = new ArrayList<>();
             if(user == null || user.size() == 0){
                 return false;
             }
             for(int i =0 ; i < user.size();i++){
                 if(user.get(i).getUserName().equals(username)&&user.get(i).getPassword().equals(username)&&user.get(i).getRole().equals(username)){
                     logOut.add(user.get(i));
                     user.remove(user.get(i));
                     return true;
                 }
             }
            return false;
        }
        public boolean searchByName(String username){
            this.searchUserName =new ArrayList<>();
            if(user.size() ==0 || user == null){
                return false;
            }
            for(int i =0; i < user.size();i++){
                if(user.get(i).getUserName().equals(username)){
                    searchUserName.add(user.get(i));
                    return true;
                }
            }
            return false;
        }
        public boolean searchByPassWord(String passWord){
            this.searchPassWord = new ArrayList<>();
            if(user.size() ==0 || user == null){
                return false;
            }
            for(int i =0; i < user.size();i++){
                if(user.get(i).getPassword().equals(passWord)){
                    searchPassWord.add(user.get(i));
                    return true;
                }
            }
            return false;
        }
        public boolean searchByRole(String role){
            this.searchRole  = new ArrayList<>();
            if(user.size() == 0 || user== null){
                return false;
            }
            for(int i =0; i < user.size();i++){
                if(user.get(i).getRole().equals(role)){
                    searchRole.add(user.get(i));
                    //return true;
                }
            }
            if(searchRole.size()!=0) {
                return true;
            }
            return false;
        }

   public LogIn getsName(String name){

       for(int i =0 ; i < user.size();i++){

           if(user.get(i).getUserName().equals(name)){
               return user.get(i);
           }
       }
       return null;
   }
   //public Boolean logIn(){
      // String name = new
  // }
   public  void  userId() {
       // LogIn member = new LogIn();
       user.add(new LogIn("john", "john1045@","manager"));
       user.add(new LogIn("hilton", "hilton01@","technology support"));
       user.add(new LogIn("jebarson", "jeb33@","representative"));
       user.add(new LogIn("arunkumar", "arun12@","customer"));
       user.add(new LogIn("buvanesh", "buvi29@","customer"));
       user.add(new LogIn("munusami", "sami07@","customer"));
       user.add(new LogIn("kaviyarason", "kavi05@","customer"));
   }


}
