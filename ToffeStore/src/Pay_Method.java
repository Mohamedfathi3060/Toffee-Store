/**
 * an Interface to All Payment Methods
 * @author AbdelrahmanMohamed
 */
public interface Pay_Method {
    /**
     * Abstract Functions
     */
    public void Redeem();

    /**
     * Abstract Function
     * @return Method Name
     */
    public String getMethodName();
}
