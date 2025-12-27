import java.time.LocalDate;

public interface Checkoutable {
    void checkout(Member member, LocalDate checkoutDate);
    void returnItem(Member member, LocalDate returndDate);
    boolean isAvailable();
}