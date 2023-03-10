package service;
import model.Customer;


import java.util.HashSet;
import java.util.Set;

public class CustomerService {
    private static CustomerService customerService = null;

    private CustomerService() {
    }

    public static CustomerService getInstance() {
        if (customerService == null) {
            customerService = new CustomerService();
        }
        return customerService;
    }

    private Set<Customer> customerSet = new HashSet<>();

    public void addCustomer(String email, String firstName, String lastName, String address) throws IllegalArgumentException {
        Customer customer = new Customer(email, firstName, lastName, address);
        customerSet.add(customer);
    }

    public Customer getCustomer(String customerEmail) {
        for (Customer customer : customerSet) {
            if (customer.getEmail().equals(customerEmail)) {
                return customer;
            }
        }
        return null;
    }

    public Set<Customer> getAllCustomers() {
        return customerSet;
    }
}


















