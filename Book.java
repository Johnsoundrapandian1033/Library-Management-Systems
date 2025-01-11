public class Book {
    private String name ;
    private String author;
    Book(String name,String author){
        this.name = name;
        this.author =author;
    }
    public void setName(String name){
        this.name = name;
    }
    public void setAuthor(String author){
        this.author =author;
    }
    public String getName(){
        return name;
    }
    public String getAuthor(){
        return author;
    }
    public String getBook(){
        return "book Name  :" +name +"     Author  :"+ author;
    }

}
