public class Vehicle {
    public String serialNumber;
    public String name;
    public String manufacturer;
    public String model;
    public int year;
    public int baseCost;
    // from the association
    private Invoice invoice;
    
    public Vehicle(String serialNumber, String name, String manufacturer,
                   String model, int year, int baseCost) {
        this.serialNumber = serialNumber;
        this.name = name;
        this.manufacturer = manufacturer;
        this.model = model;
        this.year = year;
        this.baseCost = baseCost;
    }

    public void displayInfo() {
        System.out.println("Vehicle Information:");
        System.out.println("Serial Number: " + serialNumber);
        System.out.println("Name: " + name);
        System.out.println("Manufacturer: " + manufacturer);
        System.out.println("Model: " + model);
        System.out.println("Year: " + year);
        System.out.println("Base Cost: $" + baseCost);
    }
}
