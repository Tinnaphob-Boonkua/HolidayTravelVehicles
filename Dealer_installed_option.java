public class Dealer_installed_option {
    public int optionCode;
    public String description;
    public int price;
    // from the association
    private Invoice invoice;

    public Dealer_installed_option(int optionCode, String description, int price) {
        this.optionCode = optionCode;
        this.description = description;
        this.price = price;
    }
}
