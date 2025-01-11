import java.util.*;
import java.util.Scanner;

public class SetAllotment {
    static Scanner scanner = new Scanner(System.in);
    static Library b = new Library();
    static User u = new User();

    public static void main(String[] args) {
        u.userId();
        b.stackOfBook();
        listOfBookAndUser();
    }

    public static void listOfBookAndUser() {
        boolean flag = true;
        do {
            flag = false;
            System.out.println("1) list of User");
            System.out.println("2) list of Book");
            System.out.println("3) Exit ");
            int chooce = scanner.nextInt();
            switch (chooce) {
                case 1:
                    //System.out.println("List of Users ........");
                    printUser();
                    break;
                case 2:
                    //System.out.println("List of Books.......");
                    printBook();
                    break;
                case 3:
                    System.out.println("----------Thank you--------");
                    break;
                default:
                    System.out.println("re-enter the option .....");
                    flag = true;
                    break;
            }
        } while (flag);
    }
        public static void printUser () {
        for (int i = 0; i < u.user.size(); i++) {
            System.out.println((u.user.get(i).getLogIn()));
        }
        boolean flag = true;
        do
        {
            flag =  false;
            System.out.println("1) LogIn ");
            System.out.println("2) Change Password");
            System.out.println("3) SignUp ");
            System.out.println("4) Log Out");
            System.out.println("5) Search Name ");
            System.out.println("6) Search Password");
            System.out.println("7) Search Role");
            int chooce = scanner.nextInt();
            switch(chooce){
                case 1:
                    String mty = scanner.nextLine();
                    System.out.print("Enter the UserName :");
                    String username =scanner.nextLine();
                    System.out.print("Enter the PassWord :");
                    String password =scanner.nextLine();
                    System.out.print("Enter the role in Library :");
                    String role =scanner.nextLine();
                    boolean login = u.logIn(username,password,role);
                    if(login == true) System.out.println("succeed. start your search book...... ");
                    else {
                        System.out.println("re-enter your details or change your password........");
                        flag = true;
                    }
                    break;

                case 2:
                    System.out.println("forgot your password,so create your Password.....");
                    String emty = scanner.nextLine();
                    System.out.print("Enter the Username :");
                    String username2 = scanner.nextLine();
                    System.out.print("Enter the new password  :");
                    String password2 = scanner.nextLine();
                    System.out.print("Enter the confirm password  :");
                    String confirm = scanner.nextLine();
                    System.out.print("Enter the Role :");
                    String role2 = scanner.nextLine();
                    boolean changepassword = u.changePassword(username2,password2,role2,confirm);
                    if(changepassword){
                        System.out.println("successfully changed password........ ");
                    }
                    else System.out.println("do not change password.......");
                   break;

                case 3:
                    String empty = scanner.nextLine();
                    System.out.print("Enter the Username :");
                    String username3 = scanner.nextLine();
                    System.out.print("Enter the PassWord :");
                    String password3 = scanner.nextLine();
                    System.out.print("Enter the Role :");
                    String role3 = scanner.nextLine();
                    ArrayList<LogIn> newUser = u.signUp(username3,password3,role3);
                    if(newUser.size() != 0 ) {
                        for (int i = 0; i < newUser.size(); i++) {
                           // if(newUser.get(i).getUserName().equals(username3)&&u.user.get(i).getUserName().equals(password3)&&u.user.get(i).getUserName().equals(role3)) {
                                System.out.println("last"+(i+1)+"signUp"+newUser.get(i).getLogIn());
                            }
                       // }
                        System.out.println("new User signUp successfully .......");
                    }
                    else System.out.println("your role are must customer.so,change your role ......");
                    break;
                case 4:
                    String mt = scanner.nextLine();
                    System.out.print("Enter the Username :");
                    String username4 = scanner.nextLine();
                    System.out.print("Enter the PassWord :");
                    String password4 = scanner.nextLine();
                    System.out.print("Enter the Role :");
                    String role4 = scanner.nextLine();
                    boolean logout = u.logOut(username4,password4,role4);
                    if(logout) {
                        for(int i = 0; i < u.logOut.size();i++){
                            System.out.println(u.logOut.get(i).getLogIn());
                        }
                        System.out.println("This Id are removed .........");
                    }
                    else System.out.println(" don't remove id ........");
                    break;
                case 5:
                    String emti = scanner.nextLine();
                    System.out.print("Enter the username :");
                    String username5 = scanner.nextLine();
                    boolean searchname = u.searchByName(username5);
                    if(searchname) {
                        for(int i = 0; i < u.searchUserName.size();i++){
                            System.out.println(u.searchUserName.get(i).getLogIn());
                        }
                        System.out.println(username5+"LogIn our Library.......");

                    }
                    else System.out.println(username5+"don't reg our library........");
                    break;
                case 6:
                    String emtie = scanner.nextLine();
                    System.out.print("Enter the password :");
                    String password5 = scanner.nextLine();
                    boolean searchPassword = u.searchByPassWord(password5);
                    if(searchPassword) {
                        for(int i = 0; i < u.searchPassWord.size();i++){
                            System.out.println(u.searchPassWord.get(i).getLogIn());
                        }
                        System.out.println(password5+"Reg our Library.......");

                    }
                    else System.out.println(password5+"don't reg our library........");
                    break;
                case 7:
                    String mti = scanner.nextLine();
                    System.out.print("Enter the role :");
                    String role5 = scanner.nextLine();
                    boolean searchrole = u.searchByRole(role5);
                    if(searchrole) {
                        for(int i = 0; i < u.searchRole.size();i++){
                            System.out.println(u.searchRole.get(i).getLogIn());
                        }
                        System.out.println(role5+"LogIn our Library.......");

                    }
                    else System.out.println(role5+"don't reg our library........");
                    break;
                default:
                    System.out.println("Enter valid option........ ");
                    flag = true;
                    break;
            }
        }while(flag);

     listOfBookAndUser();
    }
     public static void printBook () {
        for (int i = 0; i < b.lib.size(); i++) {
            System.out.println(b.lib.get(i).getBook());
        }
        boolean flag = true;
        do {
            flag =false;
            System.out.println("1) Add Book ");
            System.out.println("2) Remove Book ");
            System.out.println("3) Find the Book ");
            System.out.println("4) Find author Write Book");
            int option = scanner.nextInt();
           switch(option) {
               case 1:
                   String mty = scanner.nextLine();
                   System.out.print("Enter the Book name :");
                   String bookname = scanner.nextLine();
                   System.out.print(" Enter the Author name :");
                   String authorname = scanner.nextLine();
                   boolean addbook = b.addBook(bookname, authorname);
                   System.out.println(addbook);
                   if (addbook == true) System.out.println("successfully add  Book ....");
                   else System.out.println(" not add Book ......");
                   System.out.println(" New Book List --------> ");
                   for(int i = 0; i < b.lib.size(); i++){
                       System.out.println(b.lib.get(i).getBook());
                   }
                   break;
               case 2:
                   String emty = scanner.nextLine();
                   System.out.print("Enter the Book name :");
                   String bookname1  = scanner.nextLine();
                   System.out.print("Enter the Author name :");
                   String authorname2 = scanner.nextLine();
                   ArrayList<Book> removebooks = b.removeBook(bookname1,authorname2);
                   if(removebooks.size() ==0) System.out.println(" Not Remove Book ....");
                   else System.out.println("successfully remove Book ......");
                   System.out.println(" remove book List --------> ");
                   for(int i =0 ; i < removebooks.size();i++){
                       System.out.println(removebooks.get(i).getBook());
                   }
                   break;
               case 3:
                   String mt = scanner.nextLine();
                   System.out.print("Enter the Book Name : ");
                   String bookname3 = scanner.nextLine();
                   System.out.print("Enter the Author name :");
                   String authorname3 = scanner.nextLine();
                   boolean findbook = b.findTheBook(bookname3,authorname3);
                   if(findbook == true) System.out.println("Yes, Book is Available .....");
                   else System.out.println("Book is not Available.....");
                   break;
               case 4:
                   String empty = scanner.nextLine();
                   System.out.print("Enter the Author Name :");
                   String authorname4 = scanner.nextLine();
                   ArrayList<Book>writebook = b.authorWriteBooks(authorname4);
                   System.out.println("Author Wrote Books.... ");
                   for(int i =0 ; i < writebook.size();i++){
                       System.out.println(writebook.get(i).getBook());
                   }
                   break;
               default:
                   flag = true;
           }
        }while(flag);
       listOfBookAndUser();
     }

}
