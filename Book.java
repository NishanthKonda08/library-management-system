import java.time.LocalDate;

public class Book extends LibraryItem implements Checkoutable {
    private LocalDate checkout;
    private LocalDate dueDate;
    
    public Book(String title, String author, LocalDate checkout, LocalDate dueDate) {
        super(title, author, false);  
        this.checkout = checkout;
        this.dueDate = dueDate;
    }

    @Override
    public void checkout(Member member, LocalDate checkoutDate) {
        this.dueDate = checkoutDate.plusDays(14);
        this.isCheckedOut = true;
        member.addCheckedOutBook(this);
    }

    public double calculateFine(LocalDate returnDate){
        // if returned on time the no fine

        if( returnDate.isBefore(dueDate) || returnDate.isEqual(dueDate)){
            return 0.0;
        }
        else{
            long daysOverdue = returnDate.compareTo(dueDate);
            return daysOverdue * 1.0;
        }
    }

    @Override
    public void returnItem(Member member, LocalDate returnDate) {
        isCheckedOut = false;

        double fine = calculateFine(returnDate);
        if (fine > 0){
            member.addFine(fine);
        }
    }

    @Override
    public boolean isAvailable() {
        if (isCheckedOut == false) {
            return true;
        } else {
            return false;
        }
    }
}