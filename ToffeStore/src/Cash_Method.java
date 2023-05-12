/**
 * Cash Method Class That Acts in Its Own Way While Checking Out
 */
public class Cash_Method implements Pay_Method {
    /**
     * Cash Method Behaviour
     */
    @Override
    //
    public void Redeem() {
        System.out.println("Cash on Delivery Order");
    }

    /**
     * Returns Method Name to be Used to Identify the Mehtod
     * @return methodName
     */
    @Override
    public String getMethodName() {
        return "Cash";
    }

}
