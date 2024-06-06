
package test.car.rental.system;
public class TestCarRentalSystem {
  
    int carId;
    String make;
    String model;
    int year;
    double rentalPrice;
    boolean availabilityStatus;
    
    void TestCarRentalSystem(int carId, String make, String model, int year, double rentalPrice) {
        this.carId = carId;
        this.make = make;
        this.model = model;
        this.year = year;
        this.rentalPrice = rentalPrice;
        this.availabilityStatus = true; 
    }

   
    public int getCarId() {
        return carId;
    }

    public void setCarId(int carId) {
        this.carId = carId;
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
 }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public double getRentalPrice() {
        return rentalPrice;
    }

    public void setRentalPrice(double rentalPrice) {
        this.rentalPrice = rentalPrice;
    }

    public boolean isAvailable() {
        return availabilityStatus;
    }

    public void setAvailabilityStatus(boolean availabilityStatus) {
        this.availabilityStatus = availabilityStatus;
    }

    
    public void rentCar() {
        this.availabilityStatus = false;
    }
  /**
     * Marks the car as available.
     */
    public void returnCar() {
        this.availabilityStatus = true;
    }

    @Override
    public String toString() {
        return "Car{" +
                "carId=" + carId +
                ", make='" + make + '\'' +
                ", model='" + model + '\'' +
                ", year=" + year +
                ", rentalPrice=" + rentalPrice +
                ", availabilityStatus=" + availabilityStatus +
                '}';


    
   
    
}
}