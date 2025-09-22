import java.util.ArrayList;

public class Customer {
    public String customerId;
    public String customerFirstName;
    public String customerLastName;
    public String customerPhoneNumber;
    public String address;
    // from the association
    private ArrayList<Invoice> invoices;
    
    public Customer(String customerId, String customerFirstName, String customerLastName,
                    String customerPhoneNumber, String address) {
        this.customerId = customerId;
        this.customerFirstName = customerFirstName;
        this.customerLastName = customerLastName;
        this.customerPhoneNumber = customerPhoneNumber;
        this.address = address;
        this.invoices = new ArrayList<>();
    }
}
