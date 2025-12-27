import java.time.*;


public class dvd extends LibraryItem implements Checkoutable {
    private String director;
    private int numDiscs;
    private LocalDate dueDate;

    public dvd(String title, String director, int numDiscs){
        super(title, "Unknown", false);
        this.director = director;
        this.numDiscs = numDiscs;
    }

    public void checkout (Member member, LocalDate checkoutDate){
        this.dueDate = checkoutDate.plusDays(7);
        this.isCheckedOut = true;

    }

    public void returnItem(Member member, LocalDate checkoutDate){
        isCheckedOut = false;

        double fine = calculateFine(checkoutDate);
        if (fine > 0){
            member.addFine(fine);
        }
    }

    public double calculateFine(LocalDate returnDate){
        if(returnDate.isBefore(dueDate) ||returnDate.equals(dueDate)){
            return 0.0;
        }
        else{
            long daysOverdue = returnDate.compareTo(dueDate);
            return daysOverdue * 2.0;
        }
    }

    public boolean isAvailable(){
        if (isCheckedOut == false){
            return true;
        }
        else {
            return false;
        }
    }
     
}
