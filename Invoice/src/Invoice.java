public class Invoice {

    private String partNumber;
    private String partDescription;
    private int quantity;
    private double pricePerItem;


    public Invoice(){
        this.partNumber = "";
        this.partDescription = "";
        this.quantity = 0;
        this.pricePerItem = 0;
    }

    public double getInvoiceAmount(){
        double invoiceAmount = this.pricePerItem * this.quantity;
        return invoiceAmount;
    }

    public String getPartNumber() {
        return partNumber;
    }

    public void setPartNumber(String partNumber) {
        this.partNumber = partNumber;
    }

    public String getPartDescription() {
        return partDescription;
    }

    public void setPartDescription(String partDescription) {
        this.partDescription = partDescription;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        if (quantity < 0)
            this.quantity = 0;
        else
            this.quantity = quantity;
    }

    public double getPricePerItem() {
        return pricePerItem;
    }

    public void setPricePerItem(double pricePerItem) {
        if (pricePerItem < 0)
            this.pricePerItem = 0;
        else
            this.pricePerItem = pricePerItem;
    }
}
