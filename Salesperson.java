public class Salesperson {
    public String salespersonId;
    public String name;
    public String phoneNumber;
    // from the association
    private Invoice invoice;

    public Salesperson(String salespersonId, String name, String phoneNumber) {
        this.salespersonId = salespersonId;
        this.name = name;
        this.phoneNumber = phoneNumber;
    }
}
