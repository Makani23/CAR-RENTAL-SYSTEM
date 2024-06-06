package customer;

import java.util.ArrayList;
import java.util.List;

public class Customer {
    int customerId;
    String name;
    String phoneNumber;
    String email;
    List<Car> rentalHistory;

    
    public Customer(int customerId, String name, String phoneNumber, String email) {
        this.customerId = customerId;
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.email = email;
        this.rentalHistory = new ArrayList<>();
    }

    public void rentCar(Car car) {
        car.rentCar();
        rentalHistory.add(car);
    }

    public void returnCar(Car car) {
        car.returnCar();
        rentalHistory.remove(car);
    }
        @Override
    public String toString() {
        return "Customer{" +
                "customerId=" + customerId +
                ", name='" + name + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", email='" + email + '\'' +
                ", rentalHistory=" + rentalHistory +
                '}';
    }

}

