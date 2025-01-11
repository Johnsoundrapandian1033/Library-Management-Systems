import java.util.*;
import java.util.Scanner;
public class Library {
    Scanner scanner = new Scanner(System.in);
     ArrayList<Book> removebook  ;
     ArrayList<Book>books;
     ArrayList<Book> lib = new ArrayList<Book>();


    public ArrayList<Book> removeBook(String bookname,String authorname){
        this.removebook = new ArrayList<>();
        if(lib  == null || lib.size() ==0 ){
            return null;
        }
        for(int i =0 ; i < lib.size();i++){
            System.out.println(lib.get(i).getBook());
            if(lib.get(i).getName().equals(bookname) && lib.get(i).getAuthor().equals(authorname)) {
                removebook.add(lib.get(i));
                lib.remove(lib.get(i));
               // System.out.println("Inside If");
            }
        }

        System.out.println("remove book: "+removebook.size());

        return removebook;
    }
    public boolean addBook(String bookname, String authorname){
        if(lib == null){
            return false;
        }
        //ArrayList<Book>result = new ArrayList<>();
        lib.add(new Book(bookname,authorname));
       // System.out.println("SuccessFully Book Add.....");
        for(int i =  0; i< lib.size();i++){
            if(lib.get(i).getName().equals(bookname)&&lib.get(i).getAuthor().equals(authorname)){
                return true;
            }
        }
       return false;
    }
    public  ArrayList<Book> authorWriteBooks(String authorname){
        this.books = new ArrayList<>();
        for(int i =0 ; i <lib.size();i++) {
            if (lib.get(i).getAuthor().equals(authorname)){
                books.add(lib.get(i));

            }
        }
        return books;
    }
    public boolean findTheBook(String bookname,String authorname){
        for(int i =0 ; i < lib.size();i++){
            if(lib.get(i).getName().equals(bookname) && lib.get(i).getAuthor().equals(authorname)){
                //Book book = books.get(i);
               return true;
            }
        }
        return false;
    }
    public void stackOfBook() {
        lib.add(new Book("college Life", "pandian"));
        lib.add(new Book("abc", "paul"));
        lib.add(new Book("our village", "pandian"));
        lib.add(new Book("friends forever", "pandian"));
        lib.add(new Book("tallent", "alex"));
    }

}
