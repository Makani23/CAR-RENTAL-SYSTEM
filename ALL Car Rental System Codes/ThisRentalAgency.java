
package rental.agency;
  
import java.util.ArrayList;
import java.util.List;

public class RentalAgency {
    String name;
    String address;
    List<Car> cars;
    List<Customer> customers;

    // Constructor, getters and setters
    public RentalAgency(String name, String address) {
        this.name = name;
        this.address = address;
        this.cars = new ArrayList<>();
        this.customers = new ArrayList<>();
    }

    public void addCar(Car car) {
        cars.add(car);
    }

    public void removeCar(int carId) {
        cars.removeIf(car -> car.getCarId() == carId);
    }

    public void registerCustomer(Customer customer) {
        customers.add(customer);
 }

    public void rentCar(int carId, int customerId) {
        Car car = findCarById(carId);
        Customer customer = findCustomerById(customerId);

        if (car != null && customer != null && car.isAvailable()) {
            customer.rentCar(car);
        }
    }

    public void returnCar(int carId, int customerId) {
        Car car = findCarById(carId);
        Customer customer = findCustomerById(customerId);

        if (car != null && customer != null && !car.isAvailable()) {
            customer.returnCar(car);
        }
    }
public List<Car> getAvailableCars() {
        List<Car> availableCars = new ArrayList<>();
        for (Car car : cars) {
            if (car.isAvailable()) {
                availableCars.add(car);
            }
        }
        return availableCars;
    }

    public List<Car> getCustomerRentals(int customerId) {
        Customer customer = findCustomerById(customerId);
        return customer != null ? customer.getRentalHistory() : null;
    }

    private Car findCarById(int carId) {
        for (Car car : cars) {
            if (car.getCarId() == carId) {
                return car;
            }
        }
        return null;
    }

    private Customer findCustomerById(int customerId) {
        for (Customer customer : customers) {
            if (customer.getCustomerId() == customerId) {
                return customer;
            }
        }
        return null;
  }

    @Override
    public String toString() {
        return "RentalAgency{" +
                "name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", cars=" + cars +
                ", customers=" + customers +
                '}';
    }
}
        
        
        
        
        
 

    
    

