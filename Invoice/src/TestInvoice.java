public class TestInvoice {
    public static void main(String[] args) {

        Invoice i = new Invoice();
        i.setPricePerItem(20);
        i.setQuantity(3);
        System.out.println(i.getInvoiceAmount());
    }
}
