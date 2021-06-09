import java.util.Date;

public class BookReservation {
    private Date creationDate;
    private ReservationStatus status;
    private String bookItemBarcode;
    private String memberId;



    public void setStatus(ReservationStatus status) {
        this.status = status;
    }


    public String getMemberId() {
        return memberId;
    }

    public static BookReservation fetchReservationDetails(String barcode){
        BookReservation bookReservation = new BookReservation();

        return bookReservation;
    }
    public ReservationStatus getStatus(ReservationStatus r) {
        return status;
    }

    public void sendBookAvailableNotification() {
        System.out.println("The Book is available");
    }
}
