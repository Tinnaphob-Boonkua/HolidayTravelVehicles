import java.util.ArrayList;

public class Invoice {
    public String invoiceId;
    public String date;
    public float finalPrice;
    public float tradeInAllowance;
    public float taxes;
    public float licenseFee;
    public String customerSignature;
    // from the association
    private Customer customer;
    private Vehicle vehicle;
    private Salesperson salesperson;
    private ArrayList<Dealer_installed_option> Dealer_installed_option;
    private ArrayList<Trade_in> trade_in;

    public Invoice(String invoiceId, String date, float finalPrice, float tradeInAllowance,
                   float taxes, float licenseFee, String customerSignature) {
        this.invoiceId = invoiceId;
        this.date = date;
        this.finalPrice = finalPrice;
        this.tradeInAllowance = tradeInAllowance;
        this.taxes = taxes;
        this.licenseFee = licenseFee;
        this.customerSignature = customerSignature;
        this.Dealer_installed_option = new ArrayList<>();
        this.trade_in = new ArrayList<>();
    }
}
