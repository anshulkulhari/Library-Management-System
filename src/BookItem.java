import java.awt.print.Book;
import java.time.LocalDate;
import java.time.ZoneId;
import java.util.Date;

public class BookItem extends Book {
    private String barcode;
    private boolean isReferenceOnly;
    private Date borrowed;
    private Date dueDate;
    private double price;
    private BookFormat format;
    private BookStatus status;
    private Date dateOfPurchase;
    private Date publicationDate;
    private Rack placedAt;

    public String getBarcode() {
        return barcode;
    }

    public void updateBookItemStatus(BookStatus reserved) {
        this.status = reserved;
    }
    public void updateDueDate(LocalDate localdate){
        Date date = Date.from(localdate.atStartOfDay(ZoneId.systemDefault()).toInstant());
        this.dueDate=date;

    }
    public void ShowError(String error){
        System.out.println(error);
    }
    public boolean getIsReferenceOnly(){
        return isReferenceOnly;
    }

    public boolean checkout(String memberId) {
        if(this.getIsReferenceOnly()) {
            ShowError("This book is Reference only and can't be issued");
            return false;
        }
        if(!BookLending.lendBook(this.getBarcode(), memberId)){
            return false;
        }
        this.updateBookItemStatus(BookStatus.LOANED);
        return true;
    }

}