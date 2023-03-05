package edu.ithaca.barr;

public class TaxPayments extends BoardPlaces {
    
    private int payment; //how much the tax payment is for the player

    public TaxPayments(String nameIn, int paymentIn){
        super(nameIn, 2);
        payment = paymentIn;
    }

    /*
     * @return payment
     */
    public int getPayment(){
        return payment;
    }

}
