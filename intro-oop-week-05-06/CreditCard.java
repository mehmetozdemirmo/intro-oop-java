public class CreditCard {
    protected String cardNumber;
    protected double expenses;
    public void charge(double amount){
        expenses=expenses +amount;

    }
    public String getCardNumber(String password){
        if(password.equals("SECRET")){
            return cardNumber;
        }
        return "jerkface";
    }
}
