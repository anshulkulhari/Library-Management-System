import java.util.Date;

public class BookLending {
    private Date creationDate;
    private Date dueDate;
    private Date returnDate;
    private String bookItemBarcode;
    private String memberId;


    public Date getDueDate() {
        return dueDate;
    }

    public static boolean lendBook(String barcode, String memberId){
        Member member = new Member();
        BookItem bookItem = new BookItem();

        return member.checkoutBookItem(bookItem);
    }
    public static BookLending fetchLendingDetails(String barcode){
            BookLending bookLending = new BookLending();
            return bookLending;

    }
}
