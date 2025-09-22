public class Trade_in {
    public String serialNumber;
    public String make;
    public String model;
    public int year;
    // from the association
    private Invoice invoice;

    public Trade_in(String serialNumber, String make, String model, int year) {
        this.serialNumber = serialNumber;
        this.make = make;
        this.model = model;
        this.year = year;
    }
}
