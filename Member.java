import java.util.ArrayList;

public class Member {
    private String name;

    private ArrayList<Checkoutable> checkedOutBooks;  // Change this
    private double finesDue;
    
    public Member(String name) {
        this.name = name;
        this.checkedOutBooks = new ArrayList<Checkoutable>();  // Change this
        this.finesDue = 0.0;
    }
    
    public void addCheckedOutBook(Checkoutable item) {  // Change this
        checkedOutBooks.add(item);
    }
    
    public ArrayList<Checkoutable> getCurrentCheckouts() {  // Change this
        return checkedOutBooks;
    }
    
    public double getTotalFinesDue() {
        return finesDue;
    }
    
    public void addFine(double amount) {
        finesDue += amount;
    }

    public String getName(){
        return this.name;
    }
}