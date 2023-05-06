public class Cash_Method implements Pay_Method {
    @Override
    public void Redeem() {
        System.out.println("Cash on Delivery Order");
    }
    @Override
    public String getMethodName() {
        return "Cash";
    }

}
