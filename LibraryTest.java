import java.time.LocalDate;

public class LibraryTest {
    public static void main(String[] args) {
        // Create a library
        Library library = new Library();
        
        // Add some members
        Member member1 = new Member("Alice", "M001");
        Member member2 = new Member("Bob", "M002");
        library.addMember(member1);
        library.addMember(member2);
        
        // Add some items
        Book book1 = new Book("Harry Potter", "J.K. Rowling", null, null);
        Book book2 = new Book("The Hobbit", "J.R.R. Tolkien", null, null);
        dvd dvd1 = new dvd("Inception", "Christopher Nolan", 1);
        
        library.addItem(book1);
        library.addItem(book2);
        library.addItem(dvd1);
        
        // Test checkouts
        LocalDate today = LocalDate.now();
        book1.checkout(member1, today);
        dvd1.checkout(member2, today);
        
        System.out.println("Available items: " + library.getAvailableItems().size()); // Should be 1
        
        // Test returns with fines
        LocalDate returnDate = today.plusDays(20);  // Change from 5 to 20
        book1.returnItem(member1, returnDate);
        dvd1.returnItem(member2, returnDate);
        // DVD is only 7 days, so 0 fine
        
        // Display members
        library.displayAllMembers();
    }
}