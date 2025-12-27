import java.time.LocalDate;

abstract public class LibraryItem {
    private String Title;
    private String Author;
    boolean isCheckedOut;
    
    
    public LibraryItem(String title, String author, boolean isCheckedOut){
        this.Title = title;
        this.Author = author;
        this.isCheckedOut = isCheckedOut;
    }

    public abstract void checkout(Member member, LocalDate checkoutDate);
    public abstract void returnItem(Member member, LocalDate returnDate);
    public abstract boolean isAvailable();

    public String getBookInfo(){
        return "The book " + this.Title + " is written by " + this.Author;
    }
}