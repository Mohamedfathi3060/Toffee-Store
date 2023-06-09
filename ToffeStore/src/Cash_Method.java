/**
 * Cash Method Class That Acts in Its Own Way While Checking Out
 * @author AbdelrahmanMohamed
 */
public class Cash_Method implements PayMethod {
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
