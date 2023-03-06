package edu.ithaca.barr;

public class Property extends BoardPlaces {
    private int houses; //number of houses on a property
    private int hotels; //number of hotels on a property
    private Player owner; //Player object that owns the property
    private boolean mortgaged; //whether or not the property has been mortgaged
    private int initialCost; //cost of the property when initially buying
    private int baseRent; //rent cost before accounting for houses and hotels
    private int houseCost = 200;
    private int hotelCost = 200;
    private int houseRentIncrease = 200;
    private int hotelRentIncrease = 2000;
    private int mortgageAmount = 200;

    public Property(String nameIn, int initialCostIn, int baseRentIn){
        super(nameIn, 0);
        houses = 0;
        hotels = 0;
        owner = null;
        mortgaged = false;
        initialCost = initialCostIn;
        baseRent = baseRentIn;
    }
    /*
     * @post increments houses
     */
    public void buyHouse(){

    }

    /*
     * @post increments hotels
     */
    public void buyHotel(){

    }

    /*
     * @post houses count decrements by 1
     */
    public void sellHouse(){

    }

    /*
     * @post hotel count decrements by 1
     */
    public void sellHotel(){

    }

    /*
     * @return houses
     */
    public int getHouses(){
        return -1;
    }

    /*
     * @return hotels
     */
    public int getHotels(){
        return -1;
    }

    /*
     * @return rent cost based on initialCost, number of houses and hotels, and their percentages
     */
    public int calculateNewRent(){
        return -1;
    }

    /*
     * temprorarily 'sells' property so player cannot collect rent from it
     * @post gets money from property once
     */
    public void mortgage(){

    }

    /*
     * @return mortgaged
     */
    public boolean getMortgage(){
        return false;
    }

    /*
     * @return initialCost
     */
    public int getInitialCost(){
        return -1;
    }

    /*
     * @return baseRent
     */
    public int getBaseRent(){
        return -1;
    }

    /*
     * @return owner
     */
    public Player getOwner(){
        return null;
    }

    /*
     * @post owner changed to new Player
     */
    public void setOwner(Player player){

    }

}  
