public class Cash_Method implements Pay_Method {
    @Override
    // react as a cash method
    public void Redeem() {
        System.out.println("Cash on Delivery Order");
    }
    // returns method name
    @Override
    public String getMethodName() {
        return "Cash";
    }

}
