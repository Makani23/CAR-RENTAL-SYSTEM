
package car;
public class Car {
   String carId;
   String make;
   String model;
   int year;
   double rentalPrice;
   boolean availabilityStatus;
   
   
     public Car(String carId, String make, String model, int year, double rentalPrice) {
        this.carId = carId;
        this.make = make;
        this.model = model;
        this.year = year;
        this.rentalPrice = rentalPrice;
        this.availabilityStatus = true;
    }
    
    public String returnCar()
    {
         this.availabilityStatus = false;
         this.availabilityStatus = true;
         
         
       
{
        return ", availabilityStatus=" +
                "Car{" +
                "carId=" + carId +
                ", make ='" + make + '\'' +
                ", model='" + model + '\'' +
                ", year=" + year +
                ", rentalPrice=" + rentalPrice + availabilityStatus +
                '}';

    }
    }
 }