
package rental.transaction;


public class RentalTransaction {
  int transactionId;
  boolean car;
  boolean customer;
  int rentalDate;
  int returnDate;
  double rentalPrice;

    
    public RentalTransaction(int transactionId, boolean car, boolean customer, int rentalDate, int returnDate, double rentalPrice) {
        this.transactionId = transactionId;
        this.car = car;
        this.customer = customer;
        this.rentalDate = rentalDate;
        this.returnDate = returnDate;
        this.rentalPrice = rentalPrice;
    }

    @Override
    public String toString() {
        return "RentalTransaction{" +
                "transactionId=" + transactionId +
                ", car=" + car +
                ", customer=" + customer +
                ", rentalDate=" + rentalDate +
                ", returnDate=" + returnDate +
                ", rentalPrice=" + rentalPrice +
                '}';
    }
}
